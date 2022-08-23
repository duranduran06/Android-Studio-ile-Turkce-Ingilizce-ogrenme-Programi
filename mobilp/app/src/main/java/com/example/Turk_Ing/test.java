package com.example.Turk_Ing;

public class test {
    public String sorular[]= {
        "HELLO","HOME","CHAIR","PENCİL","BELIEVE","JOİN"

    };
    public String secim[][]={
            {"İYİ","GÜZEL","NABER","MERHABA"},{"EV","BİNA","BAHÇE","ODA"}, {"SEHPA","KANEPE","TABURE","SANDALYE"},{"KALEM","KAĞIT","SAYFA","DEFTER"},
            {"YAŞAMAK","ÖLMEK","İNANMAK","UMUT ETMEK"},{"AYRILMAK","KATILMAK","ÇIKMAK","UÇMAK"}
    };

    public String doğrucevap[]={"MERHABA","EV","SANDALYE","KALEM","İNANMAK","KATILMAK"};
    public String getsoru(int a)
    {
        String soru=sorular[a];
        return soru;
    }
    public String getsecim1(int a)
    {
        String secimm=secim[a][0];
        return secimm;

    }
    public String getsecim2(int a)
    {
        String secimm=secim[a][1];
        return secimm;

    }
    public String getsecim3(int a)
    {
        String secimm=secim[a][2];
        return secimm;

    }
    public String getsecim4(int a)
    {
        String secimm=secim[a][3];
        return secimm;

    }
    public String getdoğrucevap(int a)
    {
        String cevap=doğrucevap[a];
        return cevap;
    }

    }


