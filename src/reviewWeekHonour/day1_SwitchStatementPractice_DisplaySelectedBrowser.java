package reviewWeekHonour;

public class day1_SwitchStatementPractice_DisplaySelectedBrowser {
    public static void main(String[] args) {
        String browserName = "safari";
        String result = "";

        switch (browserName){
            case "chrome":
                result="chrome";
                break;
            case "firefox":
                result="firefox";
                break;
            case "safari":
                result="safari";
                break;
            case "edge":
                result="edge";
                break;
            default:
                result="Invalid Browser";
        }
        System.out.println("result = " + result);
    }

}
/*
    3-Write a program that can display the selected browser
    3.1  declare a String variable called browserName
    3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
    3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser
    Do Not use if statement or ternary
 */