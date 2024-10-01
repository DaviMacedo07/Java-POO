package AJavaCore.MInterfaces.test;

import AJavaCore.MInterfaces.domain.DataFileLoader;
import AJavaCore.MInterfaces.domain.DatabaseLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        DataFileLoader dataFileLoader = new DataFileLoader();
        databaseLoader.load();
        dataFileLoader.load();
    }
}
