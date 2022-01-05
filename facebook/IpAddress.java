package facebook;

import java.util.regex.Pattern;

public class IpAddress {
    public String validIPAddress(String queryIP) {
         final String ipv4Regex = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
         final String ipv6Regex = "([0-9a-fA-F]{1,4})";

         Pattern ipv4Pattern = Pattern.compile("^(" + ipv4Regex + "\\.){3}" + ipv4Regex + "$");
         Pattern ipv6Pattern = Pattern.compile("^(" + ipv6Regex + "\\:){7}" + ipv6Regex + "$");

         if(ipv4Pattern.matcher(queryIP).matches()) return "IPv4";
         return ipv6Pattern.matcher(queryIP).matches() ? "IPv6" : "Neither";

    }
}
