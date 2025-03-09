package week05CodingProject;

class AsteriskLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        String errorMessage = "***Error: " + message + "***";
        int length = errorMessage.length();
        StringBuilder asterisks = new StringBuilder();
        for (int i = 0; i < length; i++) {
            asterisks.append("*");
        }
        System.out.println(asterisks);
        System.out.println(errorMessage);
        System.out.println(asterisks);
    }
}