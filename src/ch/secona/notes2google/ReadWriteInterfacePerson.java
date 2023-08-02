package ch.secona.notes2google;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ReadWriteInterfacePerson {
	public static String PATH = "nge_interfacePersonList.json";

	public static void writeJson(final String path, final List<InterfacePerson> interfacePersonList) {
		ReadWriteInterfacePerson.PATH = path;
		ReadWriteInterfacePerson.writeJson(interfacePersonList);
	}

	public static void writeJson(final List<InterfacePerson> interfacePersonList) {

		try (FileOutputStream fos = new FileOutputStream(ReadWriteInterfacePerson.PATH);
				OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
				BufferedWriter writer = new BufferedWriter(osw)) {
			final String jsonString = ReadWriteInterfacePerson.list2String(interfacePersonList);

			writer.append(jsonString);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	private static String list2String(final List<InterfacePerson> interfacePersonList) {
		final Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(interfacePersonList);
	}

	public static <T> List<T> readJson(final String path, final Class<T[]> clazz) {
		ReadWriteInterfacePerson.PATH = path;
		return ReadWriteInterfacePerson.readJson(clazz);
	}

	public static <T> List<T> readJson(final Class<T[]> clazz) {
		T[] array = null;

		try {
			final Gson gson = new Gson();
			final Reader reader = Files.newBufferedReader(Paths.get(ReadWriteInterfacePerson.PATH),
					StandardCharsets.UTF_8);

			array = gson.fromJson(reader, clazz);
			reader.close();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return Arrays.asList(array);
	}
}