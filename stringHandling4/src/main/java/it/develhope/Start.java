package it.develhope;

public class Start {

    public static void main(String[] args) {

        String[] stringArray = {"", ""};

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        veryLongString = veryLongString.replace("um","HUM");
        stringArray = veryLongString.split("aliquip");

        String sub1 = stringArray[0];
        String sub2 = stringArray[1];

        System.out.println(sub1.trim());
        System.out.println(sub2.trim());

        System.out.println(sub1.indexOf("est"));
        System.out.println(sub2.indexOf("est"));

    }

}
