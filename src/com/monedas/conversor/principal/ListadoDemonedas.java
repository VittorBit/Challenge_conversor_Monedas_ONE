package com.monedas.conversor.principal;

public class ListadoDemonedas {

    public final String ListaDeConversion = """
            \nLISTA DE MONEDAS POR DENOMINACION Y NOMBRE
                               
                ALL --- Lek albanés
                AFN --- Afgani afgano
                AED --- Dírham de los Emiratos
                AMD --- Dram armenio
                ANG --- Florín antillano neerlandés
                ARS --- Peso argentino
                AOA --- Kwanza angoleño
                AUD --- Dólar australiano
                AZN --- Manat azerbaiyano
                AWG --- Florín arubeño
                BAM --- Marco bosnioherzegovino
                BDT --- Taka bangladesí
                BRL --- Real brasileño
                BBD --- Dólar de Barbados
                BGN --- Lev
                BHD --- Dinar bareiní
                BIF --- Franco burundés
                BMD --- Dólar bermudeño
                BND --- Dólar de Brunéi
                BOB --- Boliviano
                BSD --- Dólar bahameño
                BTN --- Bután
                BWP --- Pula
                BYN --- Nuevo rublo bielorruso
                BZD --- Dólar beliceño
                CAD --- Dólar canadiense
                CDF --- Franco congoleño 
                CHF --- Franco suizo
                COP --- Peso colombiano
                CLP --- Peso chileno
                CNY --- Renminbi
                CRC --- Colón costarricense
                CUP --- Peso cubano
                CVE --- Escudo caboverdiano
                CZK --- Corona checa
                DKK --- Corona danesa 
                DJF --- Franco yibutiano
                DOP --- Peso dominicano
                DZD --- Dinar argelino
                ERN --- Nakfa 
                EGP --- Libra egipcia
                ETB --- Birr etíope 
                EUR --- Euro
                FKP --- Libra malvinense
                FJD --- Dólar fiyiano 
                FOK --- Corona feroesa
                GEL --- Lari
                GBP --- Libra esterlina 
                GGP --- Libra de Guernsey
                GHS --- Cedi ghanés
                GIP --- Libra gibraltareña 
                GMD --- Dalasi 
                GNF --- Franco guineano
                GTQ --- Quetzal
                GYD --- Dólar guyanés
                HKD --- Dólar hongkonés
                HNL --- Lempira
                HTG --- Gourde
                HUF --- Florín húngaro 
                IDR --- Rupia indonesia
                ILS --- Nuevo séquel
                IMP --- Libra manesa
                INR --- Rupia india
                IQD --- Dinar iraquí 
                IRR --- Rial iraní
                ISK --- Corona islandesa
                JEP --- Libra esterlina de Jersey
                JMD --- Dólar jamaicano
                JOD --- Dinar jordano
                JPY --- Yen 
                KES --- Chelín keniano
                KGS --- Som 
                KHR --- Riel camboyano
                KID --- Dólar kiribatiano 
                KMF --- Franco comorense
                KPW --- Won norcoreano
                KRW --- Won surcoreano
                KWD --- Dinar kuwaití
                KYD --- Dólar de las Islas Caimán
                KZT --- Tenge
                LAK --- Kip
                LBP --- Libra libanesa
                LKR --- Rupia esrilanquesa 
                LRD --- Dólar liberiano
                LSL --- Loti 
                LYD --- Dinar libio
                MAD --- Dírham
                MDL --- Leu moldavo
                MGA --- Ariary malgache 
                MKD --- Denar
                MMK --- Kyat
                MNT --- Tugrik 
                MOP --- Pataca
                MRO --- Ouguiya mauritana
                MUR --- Rupia mauriciana
                MVR --- Rupia maldiva
                MWK --- Kwacha 
                MXN --- Peso mexicano
                MYR --- Ringgit
                MZN --- Metical 
                NAD --- Dólar namibio
                NGN --- Naira
                NIO --- Córdoba oro
                NOK --- Corona noruega
                NPR --- Rupia nepalí
                NZD --- Dólar neozelandés
                OMR --- Rial omaní
                PAB --- Balboa panameño
                PEN --- Nuevo sol
                PGK --- Kina
                PHP --- Peso filipino
                PKR --- Rupia pakistaní
                PLN --- Zloty
                PYG --- Guaraní
                QAR --- Rial catarí               
                RON --- Leu rumano
                RSD --- Dinar serbio
                RUB --- Rublo 
                RWF --- Francos ruandeses 
                SAR --- Rial saudí
                SBD --- Dólar salomonense
                SCR --- Rupia seychellense
                SDG --- Libra sudanesa
                SEK --- Corona sueca
                SGD --- Dólar singapurense
                SHP --- Libra de Santa Elena
                SLL --- Leone
                SOS --- Chelín somalí
                SRD --- Dólar surinamés 
                SSP --- Libra sursudanesa
                STD --- Dobra
                SYP --- Libra siria
                SZL --- Lilangeni suazi
                THB --- Baht tailandés 
                TJS --- Somoni
                TMT --- Manat turkmeno
                TND --- Dinar tunecino
                TOP --- Pa'anga
                TRY --- Lira turca
                TTD --- Dólar de Trinidad y Tobago
                TVD --- Dólar de Tuvalu
                TWD --- Nuevo dólar taiwanés
                TZS --- Chelín tanzano
                UAH --- Hryvnia
                UGX --- Chelín ugandés
                USD --- Dólar estadounidense
                UYU --- Peso uruguayo
                UZS --- Som uzbeco
                VND --- Dong
                VUV --- Vatu
                WST --- Tala 
                XAF --- Franco centroafricano
                XCD --- Dólar del Caribe Oriental
                XOF --- Franco de África Occidental
                XPF --- Franco del Pacífico
                YER --- Rial yemení
                ZAR --- Rand sudafricano
                ZMW --- kwacha zambiano
                ZWL --- Dólar zimbabuense\n""";

    public static void main(String[] args){
        ListadoDemonedas listaDenomicion = new ListadoDemonedas();
        System.out.println(listaDenomicion.ListaDeConversion);
    }
}
