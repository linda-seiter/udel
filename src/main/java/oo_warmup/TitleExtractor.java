package oo_warmup;

public class TitleExtractor {

    public static String getTitle(String html) {
        String htmlLower = html.toLowerCase();
        String startTag = "<title>";
        String endTag = "</title>";
        int startTitle = htmlLower.indexOf(startTag);
        if (startTitle < 0)
            return "";
        int endTitle = htmlLower.indexOf(endTag, startTitle + startTag.length()+1);
        if (endTitle < 0)
            return "";
        //return substring between start and end tag
        return  html.substring(startTitle + startTag.length(), endTitle);
    }

    public static void main(String[] args) {
        String str1 = "<HTML><TITLE>My Page</TITLE></HTML>";
        String str2 = new String("<html><head><title>Welcome!!!!</title></head></html>");
        String str3 = "<title></title>";
        String str4 = "<html><head><title>Welcome!!!!</head></html>";
        String str5 = "</title>My Page<title>";
        System.out.println("#1:" + getTitle(str1)); //My Page
        System.out.println("#2:" + getTitle(str2)); //Welcome!!!
        System.out.println("#3:" + getTitle(str3)); //empty string
        System.out.println("#4:" + getTitle(str4)); //empty string
        System.out.println("#5:" + getTitle(str5)); //empty string
   }
}
