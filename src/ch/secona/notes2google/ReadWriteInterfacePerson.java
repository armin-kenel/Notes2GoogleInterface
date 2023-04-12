package ch.secona.notes2google;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ReadWriteInterfacePerson {
	public static String PATH = "nge_interfacePersonList.json";

	public static void writeJson(final String path, final List<InterfacePerson> interfacePersonList) {
		PATH = path;
		writeJson(interfacePersonList);
	}

	public static void writeJson(final List<InterfacePerson> interfacePersonList) {
		try (PrintWriter out = new PrintWriter(new FileWriter(PATH))) {
			final Gson gson = new GsonBuilder().setPrettyPrinting().create();
			final String jsonString = gson.toJson(interfacePersonList);

			out.write(jsonString);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static <T> List<T> readJson(final String path, final Class<T[]> clazz) {
		PATH = path;
		return readJson(clazz);
	}

	public static <T> List<T> readJson(final Class<T[]> clazz) {
		T[] array = null;

		try {
			final Gson gson = new Gson();
			final Reader reader = Files.newBufferedReader(Paths.get(PATH));

			array = gson.fromJson(reader, clazz);
			reader.close();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return Arrays.asList(array);
	}
}