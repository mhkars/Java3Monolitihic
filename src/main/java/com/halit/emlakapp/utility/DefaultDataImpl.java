package com.halit.emlakapp.utility;

import com.halit.emlakapp.repository.IAracRepository;
import com.halit.emlakapp.repository.IKullaniciRepository;
import com.halit.emlakapp.repository.IKonutRepository;
import com.halit.emlakapp.repository.entity.Arac;
import com.halit.emlakapp.repository.entity.Konut;
import com.halit.emlakapp.repository.entity.Kullanici;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Uyglama ayağa kalarken veritabanına default verileri eklemek için kullanılır.
 * ancak bu sınıfın otomatik çalışması gerekecek.
 */
@RequiredArgsConstructor
@Component
public class DefaultDataImpl {

    private final IKullaniciRepository kullaniciRepository;
    private final IKonutRepository konutRepository;
    private final IAracRepository aracRepository;
    @PostConstruct
    private void create(){
        saveKullanici();
        saveKonutIlani();
        saveAracIlani();
    }

    private void saveAracIlani(){
        Arac arac1 = Arac.builder()
                .kullaniciId(1L)
                .sehir("Ankara")
                .marka("Toyota")
                .model("Corolla")
                .yil(2021)
                .km(23236)
                .fiyat(505000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Arac arac2 = Arac.builder()
                .kullaniciId(2L)
                .sehir("Trabzon")
                .marka("Ford")
                .model("Puma")
                .yil(2021)
                .km(32358)
                .fiyat(350000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Arac arac3 = Arac.builder()
                .kullaniciId(3L)
                .sehir("Kayseri")
                .marka("Citroen")
                .model("C4")
                .yil(2020)
                .km(41235)
                .fiyat(400000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Arac arac4 = Arac.builder()
                .kullaniciId(4L)
                .sehir("İstanbul")
                .marka("Peugeot")
                .model("3008")
                .yil(2019)
                .km(55003)
                .fiyat(700000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Arac arac5 = Arac.builder()
                .kullaniciId(5L)
                .sehir("İzmir")
                .marka("Mercedes")
                .model("EQS")
                .yil(2022)
                .km(7056)
                .fiyat(2200000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        aracRepository.saveAll(Arrays.asList(arac1, arac2,arac3,arac4,arac5));
    }

    private void saveKullanici(){

        Kullanici kullanici1 = Kullanici.builder()
                .ad("Ahmet")
                .soyad("ACAR")
                .adres("Ankara")
                .telefon("05328896525")
                .dogumTarihi(1988)
                .email("ahmet.acar@hotmail.com")
                .kullaniciAdi("ahmet88")
                .sifre("3et145ge68^&")
                .build();
        Kullanici kullanici2 = Kullanici.builder()
                .ad("Mehmet")
                .soyad("KAÇAR")
                .adres("Trabzon")
                .telefon("05488694252")
                .dogumTarihi(1975)
                .email("mehmet.kacar@hotmail.com")
                .kullaniciAdi("mehmet75")
                .sifre("s5tg16et!")
                .build();
        Kullanici kullanici3 = Kullanici.builder()
                .ad("Kazım")
                .soyad("SAÇAR")
                .adres("Kayseri")
                .telefon("05328896525")
                .dogumTarihi(1991)
                .email("kazım.sacar@gmail.com")
                .kullaniciAdi("kazım91")
                .sifre("+6um65tn46")
                .build();
        Kullanici kullanici4 = Kullanici.builder()
                .ad("Gamze")
                .soyad("SATAR")
                .adres("İstanbul")
                .telefon("05328896525")
                .dogumTarihi(1963)
                .email("gamze.satar@hotmail.com")
                .kullaniciAdi("gamze63")
                .sifre("eh6t46nhr651y")
                .build();
        Kullanici kullanici5 = Kullanici.builder()
                .ad("Suna")
                .soyad("SANAR")
                .adres("İzmir")
                .telefon("05558649393")
                .dogumTarihi(1981)
                .email("suna.sanar@outlook.com")
                .kullaniciAdi("suna81")
                .sifre("w3rhtyyhe%&")
                .build();

        kullaniciRepository.saveAll(Arrays.asList(kullanici1,kullanici2,kullanici3,kullanici4,kullanici5));
    }
    private void saveKonutIlani(){

        Konut konut1 = Konut.builder()
                .kullaniciId(2L)
                .sehir("Trabzon")
                .ilce("Vakfıkebir")
                .alan(120)
                .odaSayisi(3)
                .binaYasi(15)
                .fiyat(150000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Konut konut2 = Konut.builder()
                .kullaniciId(5L)
                .sehir("İzmir")
                .ilce("Buca")
                .alan(90)
                .odaSayisi(2)
                .binaYasi(9)
                .fiyat(1750000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Konut konut3 = Konut.builder()
                .kullaniciId(3L)
                .sehir("Konya")
                .ilce("Meram")
                .alan(150)
                .odaSayisi(3)
                .binaYasi(5)
                .fiyat(160000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Konut konut4 = Konut.builder()
                .kullaniciId(1L)
                .sehir("Ankara")
                .ilce("Yenimahalle")
                .alan(180)
                .odaSayisi(4)
                .binaYasi(3)
                .fiyat(1800000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();
        Konut konut5 = Konut.builder()
                .kullaniciId(4L)
                .sehir("İstanbul")
                .ilce("Bakırköy")
                .alan(105)
                .odaSayisi(2)
                .binaYasi(10)
                .fiyat(2500000.0)
                .ilanTarihi(LocalDateTime.now())
                .build();

        konutRepository.saveAll(Arrays.asList(konut1,konut2,konut3,konut4,konut5));
    }
}