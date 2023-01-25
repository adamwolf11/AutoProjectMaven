package Tools;


public  class Functions extends  Elements {


    public static void goUrl(String URL){driver.get(URL);}
    public static void srchClear(){Elements.srch.clear();}
    public static void srch(String MovieName){Elements.srch.sendKeys(MovieName);}


}

