import ini.controller.IniParser;
import ini.model.Ini;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        IniParser iniParser = new IniParser();
        Ini ini = iniParser.parse(new File("/Users/maksimgolish/IdeaProjects/iniparser/src/test.ini"));
        System.out.println(ini.tryGetString("COMMON", "DiscCachePath"));
        System.out.println(ini.tryGetString("Section", "login"));
    }
}