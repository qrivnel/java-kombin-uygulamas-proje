import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Pantolon pantolon = new Pantolon();
        Esofman esofman = new Esofman();
        Tshirt tshirt = new Tshirt();
        Sweat sweat = new Sweat();
        Gomlek gomlek = new Gomlek();
        CasualAyakkabi casualAyakkabi = new CasualAyakkabi();
        SporAyakkabi sporAyakkabi = new SporAyakkabi();//Nenelerim burada


        JFrame jframe = new JFrame("Kombin Application");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(700, 600);//Jframe Burada


        //Anamenu tasarım start
        JPanel anamenu = new JPanel();
        anamenu.setSize(600, 600);
        JLabel lblKiyafet, lblrenk;

        lblrenk = new JLabel("Renk Seçiniz");
        lblrenk.setBounds(10, 60, 150, 30);
        lblrenk.setFont(new Font("Calibri", Font.BOLD, 16));

        lblKiyafet = new JLabel("Ürünün Türünü Girin");
        lblKiyafet.setBounds(10, 30, 150, 30);
        lblKiyafet.setFont(new Font("Calibri", Font.BOLD, 16));

        String[] kiyafetler = {"Sweat", "Tshirt", "Gömlek", "Pantolon", "Eşofman", "Casual Ayakkabı", "Spor Ayakkabı",};//kullanıcıdan seçmesini istediğimiz
        JComboBox cboxKiyafet = new JComboBox(kiyafetler);                                                              //türleri hazırladık
        cboxKiyafet.setBounds(170, 40, 150, 20);

        String[] renkler = {"Beyaz", "Siyah", "Lacivert", "Haki", "Kahverengi", "Mavi", "Gri", "Bordo","Krem","Hardal"}; //Kullanıcadan Seçmesini istediğimiz
        JComboBox cboxRenk = new JComboBox(renkler);                                                      //renk seçeneklerini hazırladık
        cboxRenk.setBounds(170, 70, 150, 20);

        JButton btn = new JButton("Kombin Getir");
        btn.setBounds(220, 200, 150, 30);

        JButton btn2 = new JButton("Kendimi şanslı hissediyorum");
        btn2.setBounds(10, 200, 200, 30);

        JButton btn3 = new JButton("Kayıtlı kombinler");
        btn3.setBounds(10, 240, 200, 30);

        JButton cikis = new JButton("Çıkış");
        cikis.setBounds(220, 240, 150, 30);


        anamenu.setLayout(null);
        anamenu.add(lblKiyafet);
        anamenu.add(cboxKiyafet);
        anamenu.add(lblrenk);
        anamenu.add(cboxRenk);
        anamenu.add(btn);
        anamenu.add(btn2);
        anamenu.add(btn3);
        anamenu.add(cikis);
        //Anamenu Tasarımı End

        //Kombin Sayfası Tasarımı Başlangıç
        JPanel kombinPage = new JPanel();
        kombinPage.setLayout(null);
        kombinPage.setSize(600, 600);

        JLabel gelengiyim, gelenrenk, kbn1, kbn2, kbn3, kbn12, kbn22, kbn32, gelenrenk2, gelengiyim2;

        gelengiyim = new JLabel();
        gelengiyim.setBounds(200,20,170,30);
        gelengiyim.setFont(new Font("Calibri", Font.BOLD, 20));

        gelenrenk = new JLabel();
        gelenrenk.setBounds(100,20,100,30);
        gelenrenk.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn1 = new JLabel();
        kbn1.setBounds(100,60,300,30);
        kbn1.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn2 = new JLabel();
        kbn2.setBounds(100,100,300,30);
        kbn2.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn3 = new JLabel();
        kbn3.setBounds(100,140,300,30);
        kbn3.setFont(new Font("Calibri", Font.BOLD, 20));

        JButton tektarDene,asayfaget,kaydetmeEkrani;
        tektarDene = new JButton("Tekrar Kombin Getir");
        tektarDene.setBounds(100,250,200,30);

        asayfaget = new JButton("Anasayfaya Dön");
        asayfaget.setBounds(100,300,200,30);

        kaydetmeEkrani = new JButton("Kombini  kaydet");
        kaydetmeEkrani.setBounds(100,200,200,30);

        kombinPage.add(asayfaget);
        kombinPage.add(tektarDene);
        kombinPage.add(kaydetmeEkrani);

        kombinPage.add(kbn1);
        kombinPage.add(gelenrenk);
        kombinPage.add(gelengiyim);
        kombinPage.add(kbn2);
        kombinPage.add(kbn3);

        kombinPage.setVisible(false);
        // Kombin sayfası Tasarımı Bitiş


        //Kombin sayfası tasarımı 2
        JPanel kombinPage2 = new JPanel();
        kombinPage2.setLayout(null);
        kombinPage2.setSize(600,600);

        gelengiyim2 = new JLabel();
        gelengiyim2.setBounds(200,20,170,30);
        gelengiyim2.setFont(new Font("Calibri", Font.BOLD, 20));

        gelenrenk2 = new JLabel();
        gelenrenk2.setBounds(100,20,100,30);
        gelenrenk2.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn12 = new JLabel();
        kbn12.setBounds(100,60,300,30);
        kbn12.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn22 = new JLabel();
        kbn22.setBounds(100,100,300,30);
        kbn22.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn32 = new JLabel();
        kbn32.setBounds(100,140,300,30);
        kbn32.setFont(new Font("Calibri", Font.BOLD, 20));

        JButton tektarDene2,asayfaget2,kaydetmeEkrani2;

        tektarDene2 = new JButton("Yenile");
        tektarDene2.setBounds(100,250,200,30);

        asayfaget2 = new JButton("Anasayfaya Dön");
        asayfaget2.setBounds(100,300,200,30);

        kaydetmeEkrani2 = new JButton("Kombini  kaydet");
        kaydetmeEkrani2.setBounds(100,200,200,30);

        kombinPage2.add(asayfaget2);
        kombinPage2.add(tektarDene2);
        kombinPage2.add(kaydetmeEkrani2);

        kombinPage2.add(gelenrenk2);
        kombinPage2.add(gelengiyim2);
        kombinPage2.add(kbn12);
        kombinPage2.add(kbn22);
        kombinPage2.add(kbn32);

        kombinPage2.setVisible(false);
        //Kombin sayfası tasarımı 2 bitiş

        //Kayıtlı kombinler sayfası başlangıç

        JPanel kombinPage3 = new JPanel();
        kombinPage3.setLayout(null);
        kombinPage3.setSize(1000, 600);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(17, 40, 150, 30);


        JLabel kayitliKombin;
        kayitliKombin = new JLabel();
        kayitliKombin.setBounds(200, 40, 500, 30);

        JButton asayfaget3, sil;

        asayfaget3 = new JButton("Ana sayfa");
        asayfaget3.setBounds(100,300,100,30);

        sil = new JButton("Sil");
        sil.setBounds(250,300,100,30);

        kombinPage3.add(kayitliKombin);
        kombinPage3.add(comboBox);
        kombinPage3.add(asayfaget3);
        kombinPage3.add(sil);
        kombinPage3.setVisible(false);

        //Kayıtlı kombinler sayfası bitiş


        //Kombin kaydetme sayfalari başlangıç

        JPanel kombinIsmi = new JPanel();
        kombinIsmi.setLayout(null);
        kombinIsmi.setSize(600, 600);
        kombinIsmi.setVisible(false);

        JLabel label1 = new JLabel();
        label1.setText("Kombininize isim verin");
        label1.setBounds(200,100,200,30);

        JButton kaydet3 = new JButton("Kombini kaydet");
        kaydet3.setBounds(200,200,150,30);

        JButton iptal = new JButton("İptal");
        iptal.setBounds(200,250,150,30);

        JTextField textField1 = new JTextField();
        textField1.setBounds(200,150,150,25);

        kombinIsmi.add(iptal);
        kombinIsmi.add(textField1);
        kombinIsmi.add(label1);
        kombinIsmi.add(kaydet3);


        JPanel kombinIsmi2 = new JPanel();
        kombinIsmi2.setLayout(null);
        kombinIsmi2.setSize(600, 600);
        kombinIsmi2.setVisible(false);

        JLabel label2 = new JLabel();
        label2.setText("Kombininize isim verin");
        label2.setBounds(200,100,200,30);

        JButton kaydet4 = new JButton("Kombini kaydet");
        kaydet4.setBounds(200,200,150,30);

        JButton iptal2 = new JButton("İptal");
        iptal2.setBounds(200,250,150,30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(200,150,150,25);

        kombinIsmi2.add(iptal2);
        kombinIsmi2.add(textField2);
        kombinIsmi2.add(label2);
        kombinIsmi2.add(kaydet4);



        //Kombin kaydetme sayfalari bitiş

        asayfaget.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                anamenu.setVisible(true);
                kombinPage.setVisible(false);
            }
        }); //Anasayfaya geri dönme metodunun işlev kazandığı bölüm


        btn.addActionListener(new ActionListener() {//Bu metod kullanıcı butona bastığı zaman kullanıcın girdiği veriler kullanılarak oluşturduğumuz
            @Override                                 // nesneler kullanılarak uygun kombinler üretilir.
            public void actionPerformed(ActionEvent e) {
                String renk = (String)cboxRenk.getSelectedItem();
                String giyim = (String) cboxKiyafet.getSelectedItem();
                kbn3.setText( pantolon.aksesuarGetir());
                if(giyim == "Pantolon"){
                    kbn1.setText( pantolon.ustlukGetir(renk) );
                    kbn2.setText( pantolon.AyakkabiGetir(renk) );
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                }

                else if (giyim == "Eşofman") {
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    kbn1.setText(esofman.ustlukGetir(renk));
                    kbn2.setText(esofman.AyakkabiGetir(renk));
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    String altlik = sweat.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");

                    if(sayi<0)
                        kbn2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn2.setText(esofman.AyakkabiGetir(renk));
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    String altlik = tshirt.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn2.setText( esofman.AyakkabiGetir(renk) );
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    kbn1.setText( gomlek.altlikGetir(renk) );
                    kbn2.setText( gomlek.ayakkabiGetir(renk) );
                }  // Gömlek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    gelenrenk.setText(renk );
                    gelengiyim.setText( giyim );
                    kbn2.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn1.setText( casualAyakkabi.ustlukGetir(renk));
                } // Casual Ayakkabı seçilirse
                else{
                    gelenrenk.setText(renk );
                    gelengiyim.setText( giyim);
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        kbn1.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn1.setText(esofman.ustlukGetir(renk));
                }//Spor ayakkabı seçilirse
                anamenu.setVisible(false);
                kombinPage.setVisible(true);
            }
        });
        tektarDene.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String renk = gelenrenk.getText();
                String giyim = gelengiyim.getText();
                kbn3.setText( pantolon.aksesuarGetir());
                if(giyim == "Pantolon"){
                    kbn1.setText( pantolon.ustlukGetir(renk) );
                    kbn2.setText( pantolon.AyakkabiGetir(renk) );
                }
                else if (giyim == "Eşofman") {
                    kbn1.setText(esofman.ustlukGetir(renk));
                    kbn2.setText(esofman.AyakkabiGetir(renk));
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    String altlik = sweat.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn2.setText(esofman.AyakkabiGetir(renk));
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    String altlik = tshirt.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn2.setText( esofman.AyakkabiGetir(renk) );
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    kbn1.setText( gomlek.altlikGetir(renk) );
                    kbn2.setText( gomlek.ayakkabiGetir(renk) );
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    kbn2.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn1.setText( casualAyakkabi.ustlukGetir(renk));
                } // Casual Ayakkabı seçilirse
                else{
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                       kbn1.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn1.setText(esofman.ustlukGetir(renk));
                }//Spor ayakkabı seçilirse
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String renk = gelenrenk2.getText();
                String giyim = gelengiyim2.getText();
                int random = r.nextInt(7);
                int random2 = r.nextInt(10);
                kbn32.setText( pantolon.aksesuarGetir());
                switch (random2){
                    case 0:
                        renk = "Beyaz";
                        break;
                    case 1:
                        renk = "Siyah";
                        break;
                    case 2:
                        renk = "Lacivert";
                        break;
                    case 3:
                        renk = "Haki";
                        break;
                    case 4:
                        renk = "Kahverengi";
                        break;
                    case 5:
                        renk = "Mavi";
                        break;
                    case 6:
                        renk = "Gri";
                        break;
                    case 7:
                        renk = "Bordo";
                        break;
                    case 8:
                        renk = "Krem";
                        break;
                    case 9:
                        renk = "Hardal";
                        break;
                    default:
                        renk = "Beyaz";
                        break;
                }

                switch (random){  //Rastgele kıyafet
                    case 0:
                        giyim = "Tshirt";
                        break;
                    case 1:
                        giyim = "Pantolon";
                        break;
                    case 2:
                        giyim = "Eşofman";
                        break;
                    case 3:
                        giyim = "Sweat";
                        break;
                    case 4:
                        giyim = "Casual Ayakkabı";
                        break;
                    case 5:
                        giyim = "Gömlek";
                        break;
                    case 6:
                        giyim = "Spor Ayakkabı";
                        break;
                    default:
                        giyim="Tshirt";
                        break;
                }
                if(giyim == "Pantolon"){
                    kbn12.setText( pantolon.ustlukGetir(renk) );
                    kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }
                else if (giyim == "Eşofman") {
                    kbn12.setText(esofman.ustlukGetir(renk));
                    kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    String altlik = sweat.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    String altlik = tshirt.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn22.setText( esofman.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    kbn12.setText( gomlek.altlikGetir(renk) );
                    kbn22.setText( gomlek.ayakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    kbn22.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn12.setText( casualAyakkabi.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Casual Ayakkabı seçilirse
                else{
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn22.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        kbn12.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn12.setText(esofman.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }//Spor ayakkabı seçilirse

                anamenu.setVisible(false);
                kombinPage2.setVisible(true);

            }

});
        tektarDene2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String renk = gelenrenk2.getText();
                String giyim = gelengiyim2.getText();
                int random = r.nextInt(7);
                int random2 = r.nextInt(10);
                kbn32.setText( pantolon.aksesuarGetir());
                switch (random2){
                    case 0:
                        renk = "Beyaz";
                        break;
                    case 1:
                        renk = "Siyah";
                        break;
                    case 2:
                        renk = "Lacivert";
                        break;
                    case 3:
                        renk = "Haki";
                        break;
                    case 4:
                        renk = "Kahverengi";
                        break;
                    case 5:
                        renk = "Mavi";
                        break;
                    case 6:
                        renk = "Gri";
                        break;
                    case 7:
                        renk = "Bordo";
                        break;
                    case 8:
                        renk = "Krem";
                        break;
                    case 9:
                        renk = "Hardal";
                        break;
                    default:
                        renk = "Beyaz";
                        break;
                }

                switch (random){  //Rastgele kıyafet
                    case 0:
                        giyim = "Tshirt";
                        break;
                    case 1:
                        giyim = "Pantolon";
                        break;
                    case 2:
                        giyim = "Eşofman";
                        break;
                    case 3:
                        giyim = "Sweat";
                        break;
                    case 4:
                        giyim = "Casual Ayakkabı";
                        break;
                    case 5:
                        giyim = "Gömlek";
                        break;
                    case 6:
                        giyim = "Spor Ayakkabı";
                        break;
                    default:
                        giyim="Tshirt";
                        break;
                }
                if(giyim == "Pantolon"){
                    kbn12.setText( pantolon.ustlukGetir(renk) );
                    kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }
                else if (giyim == "Eşofman") {
                    kbn12.setText(esofman.ustlukGetir(renk));
                    kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    String altlik = sweat.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    String altlik = tshirt.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn22.setText( esofman.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    kbn12.setText( gomlek.altlikGetir(renk) );
                    kbn22.setText( gomlek.ayakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    kbn22.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn12.setText( casualAyakkabi.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Casual Ayakkabı seçilirse
                else{
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn22.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        kbn12.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn12.setText(esofman.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }//Spor ayakkabı seçilirse
            }
        });

        asayfaget2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                anamenu.setVisible(true);
                kombinPage2.setVisible(false);
            }});

        kaydetmeEkrani.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                kombinPage.setVisible(false);
                kombinIsmi.setVisible(true);
            }
        });

        kaydet3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("kombinler.txt");

                if (!file.exists()) {    //Dosya yoksa

                }
                try {
                    FileWriter fileWriter = new FileWriter(file,true);

                    fileWriter.write("("+textField1.getText()+")\n"+gelenrenk.getText()+" "+gelengiyim.getText()+" - "+kbn1.getText()+" - "+kbn2.getText()+" - "+kbn3.getText()+"\n");
                    fileWriter.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textField1.setText("");
                kombinPage.setVisible(true);
                kombinIsmi.setVisible(false);
            }
        });

        kaydet4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("kombinler.txt");

                if (!file.exists()) {    //Dosya yoksa

                }
                try {
                    FileWriter fileWriter = new FileWriter(file,true);

                    fileWriter.write("("+textField2.getText()+")\n"+gelenrenk2.getText()+" "+gelengiyim2.getText()+" - "+kbn12.getText()+" - "+kbn22.getText()+" - "+kbn32.getText()+"\n");
                    fileWriter.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textField2.setText("");
                kombinPage2.setVisible(true);
                kombinIsmi2.setVisible(false);
            }
        });

        kaydetmeEkrani2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                kombinPage2.setVisible(false);
                kombinIsmi2.setVisible(true);
            }
        });



        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                anamenu.setVisible(false);
                kombinPage3.setVisible(true);
                File file = new File("kombinler.txt");

                int lineNumber = 0;
                try
                {
                    BufferedReader reader = null;
                    reader = new BufferedReader(new FileReader(file));
                    String satir = reader.readLine();
                    while (satir!=null) {
                        if(satir.length()>0){
                            lineNumber++;
                        }
                        satir = reader.readLine();
                    }
                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    comboBox.removeAllItems();
                    for(int i=1;i<lineNumber;i++){
                        if ((i%2) != 0){
                            comboBox.addItem(bufferedReader.readLine());
                        }

                        else
                            bufferedReader.readLine();
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });



        iptal.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                textField1.setText("");
                kombinPage.setVisible(true);
                kombinIsmi.setVisible(false);
            }});

        iptal2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                textField2.setText("");
                kombinPage2.setVisible(true);
                kombinIsmi2.setVisible(false);

            }});

        asayfaget3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kombinPage3.setVisible(false);
                anamenu.setVisible(true);
            }
        });

        comboBox.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {

                File file = new File("kombinler.txt");

                int lineNumber = 0;
                try
                {
                    BufferedReader reader = null;
                    reader = new BufferedReader(new FileReader(file));
                    String satir = reader.readLine();
                    while (satir!=null) {
                        if(satir.length()>0){
                            lineNumber++;
                        }
                        satir = reader.readLine();
                    }
                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    for(int i=0;i<lineNumber;i++){
                        String value = bufferedReader.readLine();
                        if(value.equals(comboBox.getSelectedItem())){
                            kayitliKombin.setText(bufferedReader.readLine());
                            break;
                        }
                    }


                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });

        sil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("kombinler.txt");
                int lineNumber = 0;
                try
                {
                    BufferedReader reader = null;
                    reader = new BufferedReader(new FileReader(file));
                    String satir = reader.readLine();
                    while (satir!=null) {
                        if(satir.length()>0){
                            lineNumber++;
                        }
                        satir = reader.readLine();
                    }
                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                try {
                    ArrayList<String> arrayList = new ArrayList<>(lineNumber);
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    for(int i=0;i<lineNumber;i++){
                        arrayList.add(reader.readLine());
                    }
                    for(int k=0;k<lineNumber-2;k++){
                        if(comboBox.getSelectedItem().equals(arrayList.get(k))){
                                arrayList.remove(k);
                                arrayList.remove((k));
                                break;
                        }
                    }

                    comboBox.removeAllItems();
                    for(int i=0;i<lineNumber-2;i++){
                        if ((i%2) == 0 && comboBox.getItemCount() != (lineNumber-2)/2){
                            comboBox.addItem(arrayList.get(i));
                        }
                    }

                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    for (int t=0;t<lineNumber-2;t++){
                        bufferedWriter.write(String.valueOf(arrayList.get(t))+"\n");
                    }
                    bufferedWriter.close();

                    if (comboBox.getSelectedItem() == null)
                        kayitliKombin.setText("");

                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        cikis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jframe.add(kombinIsmi);
        jframe.add(kombinIsmi2);
        jframe.add(kombinPage);
        jframe.add(kombinPage2);
        jframe.add(kombinPage3);
        jframe.add(anamenu);
        jframe.setVisible(true);
    }
}

