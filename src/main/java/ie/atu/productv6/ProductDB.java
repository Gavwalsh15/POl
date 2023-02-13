package ie.atu.productv6;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("Rise and Fall"))
        {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Rise and Fall");
            myMusic.setPrice(6.35);
            myMusic.setArtist("Starset");
            myMusic.setLabel("Razor");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("Damage")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Damage");
            myMusic.setPrice(5);
            myMusic.setArtist("Fit for Rivals");
            myMusic.setLabel("Own Label");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("Fever Dream")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Fever Dream");
            myMusic.setPrice(9);
            myMusic.setArtist("Palaye Royale");
            myMusic.setLabel("Sumerian Records");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("LG"))
        {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("C2 4K Ultra HD HDR OLED Smart TV | OLED77C26LD.AEK");
            myTV.setPrice(3500);
            myTV.setScreenSize("83");
            myTV.setBrand("LG");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("Samsung")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("QN90B 4K HDR Neo QLED Smart TV | QE75QN90BATXXU");
            myTV.setPrice(5500);
            myTV.setScreenSize("75");
            myTV.setBrand("Samsung");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("Toshiba")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("HDR Smart TV with Sat Tuner | 24W3163DB");
            myTV.setPrice(5500);
            myTV.setScreenSize("24");
            myTV.setBrand("Toshiba");
            p = myTV;
        }
        return p;
    }
}

