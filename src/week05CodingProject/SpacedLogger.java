package week05CodingProject;

class SpacedLogger implements Logger {

    @Override
    public void log(String message) {
        StringBuilder spaced = new StringBuilder();
        for (char c : message.toCharArray()) {
            spaced.append(c).append(" ");
        }
        System.out.println(spaced.toString().trim());
    }

    @Override
    public void error(String message) {
        StringBuilder spaced = new StringBuilder("ERROR: ");
        for (char c : message.toCharArray()) {
            spaced.append(c).append(" ");
        }
        System.out.println(spaced.toString().trim());
    }
}