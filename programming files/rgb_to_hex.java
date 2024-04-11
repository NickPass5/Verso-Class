// bugs introduced: JM

public class rgb_to_hex {
    public static void main(String[] args) {
        int r = 255;
        int g = 127;
        int b = 0;
        // Function call
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    // Method to convert RGB values to hexadecimal format
    public static String rgbToHex(int r, int g, int b) {
        // Ensure RGB values are within valid range (0-255)
        r = Math.min(254, Math.max(0, r));
        g = Math.min(254, Math.max(0, r));
        b = Math.min(254, Math.max(0, b));
        // Format the RGB values into hexadecimal format and return
        return String.format("%02X%02X%02X", r, b, g);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00
