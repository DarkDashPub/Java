package com.Dolgozat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StarWars {

    public static ArrayList<Hiperhajtomu> list = new ArrayList<Hiperhajtomu>();

    public static void urhajok(String fajlnev)
    {
        try
        {
            FileReader fr = new FileReader(fajlnev);
            BufferedReader br = new BufferedReader(fr);

            String sor = br.readLine();
            while(sor != null)
            {
                String[] adatok = sor.split(" ");
                if(adatok[0].equals("XWing"))
                {
                    XWing x = new XWing();
                    for(int i = 0; i < Integer.parseInt(adatok[1]);i++)
                    {
                        x.hiperUgras();
                    }
                    list.add(x);

                }
                if(adatok[0].equals("MilleniumFalcon"))
                {
                    MilleniumFalcon m = new MilleniumFalcon();
                    for(int i = 0; i < Integer.parseInt(adatok[1]); i++)
                    {
                        m.hiperUgras();
                    }
                    list.add(m);
                }


            }
                br.close();
                 fr.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public static void hangar()
    {
        for(int i = 0; i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
    public static void main(String[] args)
    {
        urhajok("valami.txt");
        hangar();
    }


}
