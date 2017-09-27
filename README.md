# SMS Generator Project

## Installation
Clone this maven project and open this maven project with your own
IDE. IDE prefered : IntelIJ IDEA

You will need to install :
- Java 1.8
- Newest maven module

## How To Run
To run this program via IntelIJ, click Run at Top Bar Menu.

### Input
Input stored at `input/input.txt`. Input consist of list of sentence separated with new line.

Example
```
Lorep Ipsum 1.
Lorem Ipsum 2.
Lorem Ipsum 3.
...

```

### Output
A command line output.

Example
```$xslt
/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=61050:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/tools.jar:/Users/aliakbar/Documents/Projects/smsgenerator/target/classes:/Users/aliakbar/.m2/repository/yusufs/nlp/indonesia-ner/1.0.0/indonesia-ner-1.0.0.jar:/Users/aliakbar/.m2/repository/yusufs/generator/randstring/1.0.0/randstring-1.0.0.jar:/Users/aliakbar/.m2/repository/yusufs/nlp/tokenizerid/1.0.0/tokenizerid-1.0.0.jar:/Users/aliakbar/.m2/repository/NLP_ITB/POSTagger/HMM/1.0.0/HMM-1.0.0.jar:/Users/aliakbar/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:/Users/aliakbar/.m2/repository/com/google/code/gson/gson/2.5/gson-2.5.jar:/Users/aliakbar/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar smsgenerator.main.Main
objc[4213]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/bin/java (0x1060ff4c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x10716e4e0). One of the two will be used. Which one is undefined.
log4j:WARN No appenders could be found for logger (yusufs.nlp.tokenizerid.Tokenizer).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
--RESULT----
Verb : menggelar, Subject :  LINE Indonesia sukses, Frequency : 1
Verb : mengadakan, Subject :  inisiatif terbarunya, Frequency : 1
Verb : menikmati, Subject :  pengguna LINE hadir, Frequency : 1
Verb : bertujuan, Subject :  LINE Concert rangkaian konser, Frequency : 1
Verb : mendekatkan, Subject : , Frequency : 1
Verb : melalui, Subject :  jarak pengguna LINE musisi idola, Frequency : 1
Verb : merupakan, Subject :  Acara, Frequency : 1
Verb : dimeriahkan, Subject :  LINE Concert Surabaya, Frequency : 1
Verb : memberikan, Subject :  musisi papan Indonesia Glenn Fredly Isyana Sarasvati Tulus Sheila, Frequency : 1
Verb : membawa, Subject :  konser LINE Concert, Frequency : 1
Verb : masuk, Subject : , Frequency : 1
Verb : menampilkan, Subject :  dunia LINE, Frequency : 1
Verb : memberikan, Subject :  Perpaduan penampilan musisi aplikasi LINE, Frequency : 1
Verb : membuat, Subject :  pengalaman konser musik unik, Frequency : 1
Verb : menyenangkan, Subject :  pertunjukan, Frequency : 1
Verb : melihat, Subject : , Frequency : 1
Verb : menikmati, Subject :  pengguna LINE, Frequency : 1
Verb : Menjadikan, Subject : , Frequency : 1
Verb : memperkenalkan, Subject :  momen, Frequency : 1
Verb : menyenangkan, Subject :  LINE Concert khalayak sekedar acara, Frequency : 1
Verb : merupakan, Subject :  LINE Concert, Frequency : 1
Verb : wujud, Subject : , Frequency : 1
Verb : jelas, Subject :  misi ëClosing Distanceíî, Frequency : 1
Verb : disematkan, Subject :  Elemen LINE, Frequency : 1
Verb : menciptakan, Subject :  Isyana Sarasvati contohnya, Frequency : 1
Verb : menggunakan, Subject :  lagu panggung, Frequency : 1
Verb : disarankan, Subject :  lirik, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : dibuka, Subject :  Penampilan Sheila, Frequency : 1
Verb : berbicara, Subject :  haru kompilasi video Sheila Gank basis penggemar Sheila, Frequency : 1
Verb : memanggil, Subject :  Tulus Glenn Fredly, Frequency : 1
Verb : bergabung, Subject :  penonton, Frequency : 1
Verb : menciptakan, Subject :  Interaksi, Frequency : 1
Verb : mendekatkan, Subject :  suasana konser akrab sejalan misi LINE Concert, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : menghadirkan, Subject : , Frequency : 1
Verb : menjadi, Subject :  pengalaman penonton LINE Concert, Frequency : 1
Verb : terlibat, Subject :  pengalaman unik musisi, Frequency : 1
Verb : mendapatkan, Subject :  ìSenang, Frequency : 1
Verb : berkolaborasi, Subject :  pengalaman bernyanyi konser konsep unik, Frequency : 1
Verb : ujar, Subject : , Frequency : 1
Verb : menerima, Subject :  Tulus musisi kali, Frequency : 1
Verb : membawakan, Subject : , Frequency : 1
Verb : menyenangkan, Subject :  penampilan unik konsernya elemen, Frequency : 1
Verb : menciptakan, Subject :  adanya karakter Rock Brown faktor hadir, Frequency : 1
Verb : melalui, Subject :  kolaborasi hebat, Frequency : 1
Verb : tambah, Subject : , Frequency : 1
Verb : merupakan, Subject : , Frequency : 1
Verb : dipilih, Subject :  kota, Frequency : 1
Verb : membuka, Subject : , Frequency : 1
Verb : memiliki, Subject :  rangkaian acara LINE Concert Surabaya, Frequency : 1
Verb : habis, Subject :  Respon masyarakat Surabaya sekitarnya terbukti penjualan tiket, Frequency : 1
Verb : kurun, Subject : , Frequency : 1
Verb : dikenal, Subject :  Selain Surabaya, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : mendukung, Subject :  kota Indonesia, Frequency : 1
Verb : ingin, Subject :  inisiatif LINE ekosistem†digital†terdepan, Frequency : 1
Verb : memajukan, Subject : , Frequency : 1
Verb : mengumumkan, Subject :  SAP SE, Frequency : 1
Verb : mentransformasi, Subject :  Arsenal Football Club, Frequency : 1
Verb : retail†onlinenya, Subject : , Frequency : 1
Verb : memungkinkan, Subject :  ArsenalDirect.com solusi SAP Hybris Commerce, Frequency : 1
Verb : berbelanja, Subject :  penggemar, Frequency : 1
Verb : manapun, Subject : , Frequency : 1
Verb : membeli, Subject :  fans sekarang, Frequency : 1
Verb : seragam, Subject :  kit, Frequency : 1
Verb : mengikuti, Subject :  Perubahan, Frequency : 1
Verb : mengenai, Subject :  sebuah proyek penelitian, Frequency : 1
Verb : berbelanja, Subject :  kebutuhan motivasi kebiasaan, Frequency : 1
Verb : membantu, Subject :  ìPlatform e-commerce†baru, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : berbelanja, Subject : , Frequency : 1
Verb : kata, Subject :  andal pendukung, Frequency : 1
Verb : capai, Subject :  Simon Lilley direktur retail Arsenal Football Club ìHasil, Frequency : 1
Verb : meningkatkannya, Subject : , Frequency : 1
Verb : memenuhi, Subject : , Frequency : 1
Verb : berada, Subject :  kebutuhan penggemar, Frequency : 1
Verb : apapun, Subject :  dunia cara, Frequency : 1
Verb : pilih, Subject : , Frequency : 1
Verb : berbelanja, Subject : , Frequency : 1
Verb : mendukung, Subject :  dukungan solusi SAP Hybris Commerce, Frequency : 1
Verb : mencapai, Subject :  transformasi kemampuan†retailnya Arsenal, Frequency : 1
Verb : berupa†86, Subject :  hasil saat, Frequency : 1
Verb : fleksibilitas†omnichannel†bawaannya, Subject : , Frequency : 1
Verb : memungkinkan, Subject :  SAP Hybris Commerce, Frequency : 1
Verb : manapun, Subject : , Frequency : 1
Verb : terlibat, Subject : , Frequency : 1
Verb : terlepas, Subject :  bertransaksi pelanggan, Frequency : 1
Verb : digunakan, Subject :  tempat waktu perangkat, Frequency : 1
Verb : membantu, Subject :  Kemampuan solusi, Frequency : 1
Verb : terlibat, Subject : , Frequency : 1
Verb : memahami, Subject : , Frequency : 1
Verb : mulai, Subject :  audiens bagian pengalaman perdagangan, Frequency : 1
Verb : mengurangi, Subject :  Hal, Frequency : 1
Verb : dimiliki, Subject :  waktu kompleksitas pengintegrasian sistem, Frequency : 1
Verb : bereaksi, Subject :  Selain SAP Hybris Commerce perusahaan, Frequency : 1
Verb : terlibat, Subject : , Frequency : 1
Verb : disertai, Subject :  pelanggan penggemar ñ acara-acara klub pengumuman pemain peluncuran alat, Frequency : 1
Verb : pakai, Subject :  perdagangan†merchandising Infrastruktur, Frequency : 1
Verb : membantu, Subject :  terukur, Frequency : 1
Verb : menahan, Subject : , Frequency : 1
Verb : membantu, Subject :  lonjakan lintas, Frequency : 1
Verb : memastikan, Subject : , Frequency : 1
Verb : berbelanja, Subject : , Frequency : 1
Verb : dinikmati, Subject :  batas, Frequency : 1
Verb : hati, Subject :  ìIndustri olah raga hiburan, Frequency : 1
Verb : memiliki, Subject :  SAP, Frequency : 1
Verb : dimiliki, Subject :  pemahaman mendalam harapan, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : kata, Subject :  pasar, Frequency : 1
Verb : menyangkut, Subject : , Frequency : 1
Verb : menjadi, Subject :  atletik penggemar, Frequency : 1
Verb : bergairah, Subject :  konsumen, Frequency : 1
Verb : menuntut, Subject : , Frequency : 1
Verb : berkualitas, Subject : , Frequency : 1
Verb : memungkinkan, Subject :  pemikiran solusi SAP Hybris, Frequency : 1
Verb : memberikan, Subject :  organisasi Arsenal Football Club, Frequency : 1
Verb : mencerminkan, Subject :  layanan produk penggemar, Frequency : 1
Verb : miliki, Subject :  pendirian penghargaan, Frequency : 1
Verb : ukurnya, Subject : , Frequency : 1
Verb : diberikan, Subject :  bukanlah tawaran, Frequency : 1
Verb : mengumumkan, Subject :  Traveloka perusahaan internet penyedia aplikasi travel booking destinasi hari, Frequency : 1
Verb : memberikan, Subject :  dukungannya rangkaian acara Bandung 2017 Traveloka, Frequency : 1
Verb : berlangsung, Subject :  penawaran hotel aktivitas rekreasi program, Frequency : 1
Verb : merupakan, Subject :  Keterlibatan Traveloka program, Frequency : 1
Verb : wujud, Subject : , Frequency : 1
Verb : mengembangkan, Subject :  komitmen Traveloka, Frequency : 1
Verb : mendukung, Subject :  pariwisata Indonesia, Frequency : 1
Verb : menjadi, Subject :  inisiatif pemerintah kota Bandung, Frequency : 1
Verb : melalui, Subject :  Bandung Smart City, Frequency : 1
Verb : berbasis, Subject : , Frequency : 1
Verb : mempromosikan, Subject : , Frequency : 1
Verb : berupaya, Subject :  kota Bandung destinasi liburan Traveloka, Frequency : 1
Verb : memberikan, Subject :  semaksimal, Frequency : 1
Verb : menawarkan, Subject :  pengalaman booking, Frequency : 1
Verb : mengatakan, Subject :  Dannis Muhammad Head Traveloka, Frequency : 1
Verb : ìKami, Subject : , Frequency : 1
Verb : mengumumkan, Subject : , Frequency : 1
Verb : Melalui, Subject :  partisipasi Traveloka partner perjalanan Bandung 2017, Frequency : 1
Verb : ingin, Subject :  acara, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : menawarkan, Subject :  kemeriahan hari Bandung, Frequency : 1
Verb : beragam, Subject :  harga tambahan diskon, Frequency : 1
Verb : harap, Subject : , Frequency : 1
Verb : membantu, Subject :  adanya inisiatif, Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : menghabiskan, Subject :  minat wisatawan, Frequency : 1
Verb : menyampaikan, Subject :  kesempatan Wali Kota Bandung Ridwan Kamil, Frequency : 1
Verb : berikan, Subject :  apresiasinya Traveloka sinergi penyelenggaraan program pemerintah daerah ìDukungan Traveloka, Frequency : 1
Verb : membantu, Subject : , Frequency : 1
Verb : menjadi, Subject :  upaya kota Bandung, Frequency : 1
Verb : melalui, Subject :  Smart City, Frequency : 1
Verb : membantu, Subject : , Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : diharapkan, Subject :  wisatawan Bandung dukungan, Frequency : 1
Verb : menginspirasi, Subject : , Frequency : 1
Verb : mendorong, Subject : , Frequency : 1
Verb : memanfaatkan, Subject :  masyarakat Bandung, Frequency : 1
Verb : mengadakan, Subject :  Amartha PT Amartha Mikro Fintek pionir layanan fintech Peer-to-Peer P2P Lending usaha mikro, Frequency : 1
Verb : diadakan, Subject :  kegiatan pelayanan masyarakat pedesaan Kegiatan Agustus 2017 dikemas bentuk pemeriksaan mata pemberian kacamata, Frequency : 1
Verb : yakni, Subject :  kota Jawa Timur, Frequency : 1
Verb : berasal, Subject :  ì80 informasi hari, Frequency : 1
Verb : terganggu, Subject :  mata kesehatan mata, Frequency : 1
Verb : beraktivitas, Subject :  seseorang, Frequency : 1
Verb : berproduksi, Subject : , Frequency : 1
Verb : ungkap, Subject :  maksimalî, Frequency : 1
Verb : menjadi, Subject :  Zakie PR Manager Amartha, Frequency : 1
Verb : ditemui, Subject :  Masalah penglihatan rabun, Frequency : 1
Verb : memasuki, Subject : , Frequency : 1
Verb : membuat, Subject :  usia tahun Hal kali, Frequency : 1
Verb : mengantisipasi, Subject :  masyarakat enggan, Frequency : 1
Verb : mendapatkan, Subject :  masyarakat pedesaan, Frequency : 1
Verb : memilih, Subject :  akses pemeriksaan mata kacamata baca, Frequency : 1
Verb : ungkap, Subject :  ìYa aja Palingan baca jauhan aja Masî, Frequency : 1
Verb : dimulai, Subject :  Kegiatan, Frequency : 1
Verb : mencatat, Subject :  26-27 Agustus, Frequency : 1
Verb : memperoleh, Subject :  warga, Frequency : 1
Verb : dibagikan, Subject :  layanan pemeriksaan mata kacamata, Frequency : 1
Verb : membutuhkan, Subject :  warga, Frequency : 1
Verb : memakai, Subject :  ìWah, Frequency : 1
Verb : minta, Subject : , Frequency : 1
Verb : memasukkan, Subject :  bantuan anak, Frequency : 1
Verb : ingin, Subject :  benang jarum, Frequency : 1
Verb : menjahit, Subject : , Frequency : 1
Verb : pakai, Subject : , Frequency : 1
Verb : melakukan, Subject :  kacamata, Frequency : 1
Verb : ungkap, Subject :  aktivitas jarak mengaji membaca buku, Frequency : 1
Verb : Bekerjasama, Subject : , Frequency : 1
Verb : memiliki, Subject :  provider lensa kacamata global-Essilor Group Amartha, Frequency : 1
Verb : melakukan, Subject :  target, Frequency : 1
Verb : diimbangi, Subject :  kegiatan kali setahun ìAmartha produktivitas, Frequency : 1
Verb : mendapatkan, Subject :  kualitas kesehatan masyarakat pedesaan kesulitan, Frequency : 1
Verb : menjadi, Subject :  layanan Amartha berkomitmen, Frequency : 1
Verb : merata, Subject :  penghubung supaya kesejahteraan, Frequency : 1
Verb : terwujud, Subject : , Frequency : 1
Verb : sehat, Subject : , Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : berlangsungnya, Subject :  Ibu Anggi Mardiyanti Kepala Desa Kebonagung Mojokerto lokasi, Frequency : 1
Verb : memasuki, Subject :  aktivitas ìKegiatan warga daerah warga, Frequency : 1
Verb : lanjut, Subject : , Frequency : 1
Verb : berharap, Subject :  pemberian akses kacamata, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : dikembangkan, Subject :  potensi, Frequency : 1
Verb : ungkap, Subject :  warga bermanfaat keluarga lingkungan, Frequency : 1
Verb : meluangkan, Subject : , Frequency : 1
Verb : didasarkan, Subject :  Pernyataan, Frequency : 1
Verb : dirilis, Subject :  hasil riset, Frequency : 1
Verb : berbasis, Subject :  Inside ID sebuah lembaga riset pemasaran, Frequency : 1
Verb : dilakukan, Subject :  Riset, Frequency : 1
Verb : melibatkan, Subject :  Semester I tahun 2017, Frequency : 1
Verb : ditemukan, Subject :  riset Inside ID, Frequency : 1
Verb : mengaku, Subject :  fakta wanita, Frequency : 1
Verb : dibandingkan, Subject :  ìBerdasar data pria wanita gemar game wanita, Frequency : 1
Verb : ujar, Subject : , Frequency : 1
Verb : menurut, Subject :  Uniknya, Frequency : 1
Verb : menyempatkan, Subject :  Andres wanita, Frequency : 1
Verb : berasal, Subject :  diri game justru, Frequency : 1
Verb : yakni, Subject :  rentang usia, Frequency : 1
Verb : berada, Subject :  rentang usia wanita, Frequency : 1
Verb : menunjukkan, Subject :  Hasil riset Inside ID, Frequency : 1
Verb : menjadi, Subject :  game, Frequency : 1
Verb : mengisi, Subject :  solusi wanita, Frequency : 1
Verb : mengusir, Subject :  waktu, Frequency : 1
Verb : mulai, Subject :  Ditambah industri game, Frequency : 1
Verb : beragam, Subject :  kaum wanita kehadiran, Frequency : 1
Verb : menambah, Subject :  jenis game platform game hal, Frequency : 1
Verb : memainkan, Subject :  kemudahan segi fleksibilitas waktu, Frequency : 1
Verb : menjadi, Subject :  Genre game, Frequency : 1
Verb : adalah, Subject :  wanita, Frequency : 1
Verb : menyukai, Subject : , Frequency : 1
Verb : memiliki, Subject :  game, Frequency : 1
Verb : menyukai, Subject :  alur cerita genre petualangan adventure Wanita, Frequency : 1
Verb : sifatnya, Subject :  game, Frequency : 1
Verb : dimainkan, Subject :  killing time biasanya game, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : menunggu, Subject :  kerjaan, Frequency : 1
Verb : menyukai, Subject :  Ditambah wanita, Frequency : 1
Verb : berlanjut, Subject :  game, Frequency : 1
Verb : digemari, Subject :  kategori platform game, Frequency : 1
Verb : menjelaskan, Subject :  wanita Andres, Frequency : 1
Verb : Terdapat, Subject : , Frequency : 1
Verb : adalah, Subject :  wanita game Personal Computer PC laptop, Frequency : 1
Verb : berusia, Subject :  kaum, Frequency : 1
Verb : menambahkan, Subject : , Frequency : 1
Verb : menunjukkan, Subject :  riset, Frequency : 1
Verb : menunjukkan, Subject :  wanita gemar game hasil riset Inside ID, Frequency : 1
Verb : berusia, Subject :  orang-orang, Frequency : 1
Verb : menyukai, Subject :  tahun, Frequency : 1
Verb : menyukai, Subject : , Frequency : 1
Verb : menyukai, Subject :  game bergenre strategi, Frequency : 1
Verb : adalah, Subject :  Inside ID, Frequency : 1
Verb : menyuguhkan, Subject :  lembaga riset pemasaran, Frequency : 1
Verb : dilakukan, Subject :  pemahaman mendalam perilaku, Frequency : 1
Verb : Melalui, Subject : , Frequency : 1
Verb : menganalisis, Subject :  metodologi Inside ID, Frequency : 1
Verb : memahami, Subject : , Frequency : 1
Verb : mengenai, Subject : , Frequency : 1
Verb : melakukan, Subject :  PT MRT Jakarta, Frequency : 1
Verb : terkait, Subject :  penandatanganan Perjanjian Kerja PKS PT Qlue Performa Indonesia, Frequency : 1
Verb : berbasis, Subject :  fasilitas aduan, Frequency : 1
Verb : mengetahui, Subject :  daring, Frequency : 1
Verb : ditandatangani, Subject : , Frequency : 1
Verb : dibuat, Subject :  ìKerja, Frequency : 1
Verb : berkontribusi, Subject :  warga Jakarta masyarakat terdampak proses pembangunan MRT Jakarta pengguna jalan calon pengguna MRT Jakarta, Frequency : 1
Verb : menyampaikan, Subject : , Frequency : 1
Verb : aspirasinya, Subject :  laporan, Frequency : 1
Verb : Berdasarkan, Subject : , Frequency : 1
Verb : menganalisis, Subject :  laporan PT MRT Jakarta, Frequency : 1
Verb : memberikan, Subject :  masalah lapangan, Frequency : 1
Verb : menuju, Subject :  solusi sasaran masa pembangunan, Frequency : 1
Verb : menjadi, Subject :  Penanganan keluhan atau†complaint handling†wajib, Frequency : 1
Verb : berupaya, Subject :  bagian proses bukti pemerintah donor masyarakat, Frequency : 1
Verb : membuat, Subject : , Frequency : 1
Verb : menyampaikan, Subject :  Rama Raditya, Frequency : 1
Verb : adalah, Subject :  ìQlue, Frequency : 1
Verb : berbasis, Subject : , Frequency : 1
Verb : memungkinkan, Subject :  media, Frequency : 1
Verb : melaporkan, Subject :  warga, Frequency : 1
Verb : terdapat, Subject :  keluhan pembuat kebijakan aparat kota penyedia fasilitas jasa publik, Frequency : 1
Verb : terhambat, Subject :  komunikasi arah, Frequency : 1
Verb : terdiri, Subject :  Aplikasi, Frequency : 1
Verb : menganalisis, Subject :  aplikasi gawai papan instrumen, Frequency : 1
Verb : menyelesaikan, Subject : , Frequency : 1
Verb : melaporkan, Subject :  masalah warga, Frequency : 1
Verb : turut, Subject : , Frequency : 1
Verb : merasa, Subject : , Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : menjadi, Subject :  kota, Frequency : 1
Verb : berdaya, Subject : , Frequency : 1
Verb : mempergunakan, Subject :  î Masyarakat kota, Frequency : 1
Verb : dilaksanakan, Subject :  PKS PT MRT Jakarta PT Qlue Performa Indonesia, Frequency : 1
Verb : diperpanjang, Subject :  periode tahun, Frequency : 1
Verb : diharapkan, Subject :  adanya kerja, Frequency : 1
Verb : merasa, Subject :  warga Jakarta, Frequency : 1
Verb : turut, Subject : , Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : merawat, Subject : , Frequency : 1
Verb : dinikmati, Subject :  fasilitas transportasi publik, Frequency : 1
Verb : dikirim, Subject :  waktu tahun depan Laporan, Frequency : 1
Verb : melalui, Subject :  telepon genggam format teks foto video, Frequency : 1
Verb : melengkapinya, Subject :  sistem operasi Android iOS, Frequency : 1
Verb : menjadi, Subject :  laporan, Frequency : 1
Verb : berupaya, Subject :  Pemerintah Provinsi DKI Jakarta, Frequency : 1
Verb : mewujudkan, Subject : , Frequency : 1
Verb : menjadi, Subject :  transportasi Moda Raya MRT, Frequency : 1
Verb : mengurai, Subject :  solusi, Frequency : 1
Verb : mencapai, Subject :  29 Agustus garis pengerjaan MRT Jakarta, Frequency : 1
Verb : Terdapat, Subject : , Frequency : 1
Verb : dibangun, Subject :  stasiun, Frequency : 1
Verb : adalah, Subject :  fase jalur Lebak Bulus ñ Bundaran HI, Frequency : 1
Verb : melayani, Subject :  kilometer, Frequency : 1
Verb : melalui, Subject :  penumpang hari, Frequency : 1
Verb : tempuh, Subject :  set kereta set kereta operasi kereta cadangan, Frequency : 1
Verb : adalah, Subject :  rute, Frequency : 1
Verb : dioperasikan, Subject :  Kereta, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : merupakan, Subject :  sistem Train Control†(CBTC, Frequency : 1
Verb : ditargetkan, Subject :  Fase Bundaran HI ñ Kampung Bandan, Frequency : 1
Verb : mulai, Subject : , Frequency : 1
Verb : dibangun, Subject : , Frequency : 1
Verb : berencana, Subject :  bulan Oktober, Frequency : 1
Verb : membangun, Subject : , Frequency : 1
Verb : yakni, Subject :  MRT Jakarta koridor, Frequency : 1
Verb : dimulai, Subject :  Selatan ñ Utara Timur ñ Barat Koridor Timur ñ Barat Cikarang Bekasi Balaraja Banten, Frequency : 1
Verb : membentang, Subject :  tahun, Frequency : 1
Verb : adalah, Subject :  MRT Jakarta, Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : memberikan, Subject :  mobilitas MRT Jakarta, Frequency : 1
Verb : mengatasi, Subject :  manfaat tambahan perbaikan kualitas udara solusi, Frequency : 1
Verb : beralih, Subject :  kemacetan adanya perubahan gaya hidup masyarakat Jabodetabek, Frequency : 1
Verb : menggelar, Subject :  Minggu komponen masyarakat, Frequency : 1
Verb : unjuk, Subject : , Frequency : 1
Verb : menghentikan, Subject :  rasa pemerintah, Frequency : 1
Verb : memberikan, Subject :  Hal layanan live streaming ditengarai, Frequency : 1
Verb : lakukan, Subject :  Kementerian Kominfo, Frequency : 1
Verb : kunjungi, Subject : , Frequency : 1
Verb : melihat, Subject :  markas BIGO LIVE, Frequency : 1
Verb : dilakukan, Subject :  pemantauan layanan, Frequency : 1
Verb : diperkenalkan, Subject :  Tim BIGO LIVE, Frequency : 1
Verb : bertukar, Subject :  kegiatan kunjungan perwakilan Kementerian Komunikasi Informatika Republik Indonesia Agustus 2017 kantor perwakilan BIGO LIVE, Frequency : 1
Verb : memiliki, Subject :  Tim, Frequency : 1
Verb : memelihara, Subject :  misi, Frequency : 1
Verb : sehat, Subject :  lingkungan†live streaming†yang, Frequency : 1
Verb : mengidentifikasi, Subject :  keteguhan ëEfisiensi Akurasií BIGO LIVE, Frequency : 1
Verb : menyaring, Subject : , Frequency : 1
Verb : memastikan, Subject :  kegiatan-kegiatan konten-konten, Frequency : 1
Verb : berlaku, Subject :  segala peraturan regulasi lokal, Frequency : 1
Verb : mengatakan, Subject :  Jianqiang HU,†Co-Founder†BIGO LIVE, Frequency : 1
Verb : menjunjung, Subject :  ìPihak kementerian Indonesia, Frequency : 1
Verb : diharapkan, Subject :  upaya hal pemantauan lingkungan†online, Frequency : 1
Verb : menempati, Subject : , Frequency : 1
Verb : beroperasi, Subject :  posisi panutan perusahaan TI dan†platform†live-streaming†yang, Frequency : 1
Verb : mengadopsi, Subject :  BIGO LIVE, Frequency : 1
Verb : mengidentifikasi, Subject :  teknologi pemantauan seperti†ëImage Recognition Systemí†yang, Frequency : 1
Verb : merupakan, Subject :  pelanggaran berat laporan kegiatan peringatan Sistem, Frequency : 1
Verb : diterapkan, Subject :  teknologi inti, Frequency : 1
Verb : memastikan, Subject :  BIGO LIVE, Frequency : 1
Verb : meliputi, Subject :  Selain teknologi pemantauan BIGO LIVE, Frequency : 1
Verb : memungkinkannya, Subject :  fitur†machine learning, Frequency : 1
Verb : menyaring, Subject : , Frequency : 1
Verb : memotong, Subject :  Sistem, Frequency : 1
Verb : dianggap, Subject : , Frequency : 1
Verb : dikirim, Subject :  pelanggaran ìtingkat, Frequency : 1
Verb : lanjut, Subject :  anggota tim diproses, Frequency : 1
Verb : memastikan, Subject : , Frequency : 1
Verb : ditindaklanjuti, Subject :  pelanggaran, Frequency : 1
Verb : menerapkan, Subject :  teknologinya BIGO LIVE, Frequency : 1
Verb : menyelaraskan, Subject :  upaya-upaya, Frequency : 1
Verb : memperketat, Subject :  contoh BIGO LIVE, Frequency : 1
Verb : membentuk, Subject :  penyaringannya bulan Ramadhan, Frequency : 1
Verb : menambahkan, Subject :  tim, Frequency : 1
Verb : berdedikasi, Subject : , Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : menyesuaikan, Subject : , Frequency : 1
Verb : menghormati, Subject :  Selain, Frequency : 1
Verb : mengumpulkan, Subject :  budaya agama Indonesia, Frequency : 1
Verb : meluncurkan, Subject :  tim, Frequency : 1
Verb : dilakukan, Subject :  Hal, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : memperkuat, Subject :  pemantauan non-stop,î Jianqiang HU, Frequency : 1
Verb : menghentikan, Subject :  kerjasama departemen bidang hukum, Frequency : 1
Verb : menjaga, Subject :  pelanggaran, Frequency : 1
Verb : sehat, Subject :  lingkungan, Frequency : 1
Verb : berkomentar, Subject :  Semuel Abrijani Pangerapan Direktur Jenderal Aplikasi Informatika Kementerian Komunikasi Informatika Republik Indonesia, Frequency : 1
Verb : melihat, Subject : , Frequency : 1
Verb : merupakan, Subject :  upaya BIGO LIVE, Frequency : 1
Verb : berharap†live, Subject : , Frequency : 1
Verb : diatur, Subject :  Indonesia, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : dilakukan, Subject :  upaya, Frequency : 1
Verb : ada, Subject :  BIGO LIVE, Frequency : 1
Verb : mengaitkan, Subject :  konten-konten, Frequency : 1
Verb : nama†brand-nya, Subject : , Frequency : 1
Verb : Berdasarkan, Subject :  di†platform†media lainnya, Frequency : 1
Verb : dilihat, Subject :  analisis BIGO LIVE video, Frequency : 1
Verb : mengaitkan, Subject : , Frequency : 1
Verb : kata, Subject :  namanya, Frequency : 1
Verb : berasal, Subject :  kunci antaranya, Frequency : 1
Verb : menjelaskan, Subject :  Jianqiang HU, Frequency : 1
Verb : melaporkan, Subject :  ìSejak Juli total, Frequency : 1
Verb : sampai, Subject :  konten kepada†platformmedia lainnya, Frequency : 1
Verb : dihapuskan, Subject :  saat antaranya, Frequency : 1
Verb : mendorong, Subject :  BIGO LIVE, Frequency : 1
Verb : bekerjasama, Subject :  pengguna masyarakat, Frequency : 1
Verb : menjaga, Subject : , Frequency : 1
Verb : sehat, Subject : , Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : menyangkut, Subject :  hal, Frequency : 1
Verb : saatnya, Subject :  semua, Frequency : 1
Verb : memerangi, Subject : , Frequency : 1
Verb : menyimpulkan, Subject :  pelanggaran-pelanggaran konten ranah†online,î Jianqiang HU, Frequency : 1
Verb : bergiliran, Subject :  startup gelombang Program Akselerator Play†Indonesia, Frequency : 1
Verb : mempresentasikan, Subject : , Frequency : 1
Verb : melalui, Subject :  pencapaian rencana pengembangan acara†ìDemo Dayî, Frequency : 1
Verb : menandai, Subject :  Demo Day, Frequency : 1
Verb : merupakan, Subject :  kelulusan startup binaan program akselerator Play Indonesia †Program, Frequency : 1
Verb : berskala, Subject :  hasil kerjasama Gan Konsulindo perusahaan investasi lokal Indonesia akselerator startup, Frequency : 1
Verb : berkantor, Subject : , Frequency : 1
Verb : terlepas, Subject :  Aktivitas Plug†and Play Indonesia, Frequency : 1
Verb : bermitra, Subject :  dukungan perusahaan, Frequency : 1
Verb : mitra, Subject :  Astra Bank Negara Indonesia Bank Tabungan Negara Sinar Mas, Frequency : 1
Verb : bertambah, Subject : , Frequency : 1
Verb : diselenggarakan, Subject :  Acara Demo Indonesia, Frequency : 1
Verb : dan†akan, Subject :  siang Ballroom Djakarta Theater, Frequency : 1
Verb : dihadiri, Subject : , Frequency : 1
Verb : meliputi, Subject :  tamu, Frequency : 1
Verb : mitra, Subject :  petinggi perusahaan, Frequency : 1
Verb : didirikan, Subject :  Program Akselerator Play Indonesia kali, Frequency : 1
Verb : bertemakan, Subject :  tahun membantu†startup ide bisnis produk, Frequency : 1
Verb : diharapkan, Subject :  ìMobileî ìFintechî, Frequency : 1
Verb : menumbuhkan, Subject :  dapat†merubah, Frequency : 1
Verb : mengenai, Subject :  minggu startup workshop, Frequency : 1
Verb : bertemu, Subject :  business modeling hacking pitching fundraising acara, Frequency : 1
Verb : mengumumkan, Subject :  kesembilan startup, Frequency : 1
Verb : mengumpulkan, Subject :  keberhasilan, Frequency : 1
Verb : menjalin, Subject :  dana†lanjutan, Frequency : 1
Verb : mengembangkan, Subject :  kerjasama, Frequency : 1
Verb : merupakan, Subject :  Kesembilan startup gelombang Indonesia meliputi†Astronaut, Frequency : 1
Verb : berbasis, Subject :  startup platform video-selfie, Frequency : 1
Verb : memfasilitasi, Subject :  mobile, Frequency : 1
Verb : mengirim, Subject :  interview kemudian†Brankas platform fitur, Frequency : 1
Verb : Ada, Subject : , Frequency : 1
Verb : adalah, Subject :  Bustiket, Frequency : 1
Verb : memungkinkan, Subject :  platform, Frequency : 1
Verb : melakukan, Subject :  pengguna, Frequency : 1
Verb : terhubung, Subject :  pemesanan tiket bus†antarkota sistem distribution system GDS, Frequency : 1
Verb : menghubungkan, Subject :  offline travel†agencies,†Dana Didik platform crowdfunding, Frequency : 1
Verb : melalui, Subject :  mahasiswa dengan†calon penyumbang dana, Frequency : 1
Verb : memungkinkan, Subject :  Karta †Penyedia jasa iklan sepeda motor, Frequency : 1
Verb : ditempuh,†KYCK, Subject :  pengendaranya†mendapatkan pendapatan jarak, Frequency : 1
Verb : memungkinkan, Subject :  platform, Frequency : 1
Verb : melakukan, Subject :  penyedia jasa, Frequency : 1
Verb : menawarkan, Subject :  proses Know Your†Customer KYC jarak remote,†Otospector, Frequency : 1
Verb : distandarisasikan, Subject :  jasa inspeksi mobil bekas mekanik†terverifikasi sistem penilaian, Frequency : 1
Verb : memungkinkan, Subject :  Laporan ata kondisi kendaraan†dapat diakses e-commerce, Frequency : 1
Verb : membeli, Subject :  pengguna, Frequency : 1
Verb : merupakan, Subject :  sayur secara†langsung petani, Frequency : 1
Verb : menerima, Subject :  bulan startup, Frequency : 1
Verb : sampai, Subject :  dukungan Play Indonesia,†mulai pendanaan mentorship, Frequency : 1
Verb : bertemu, Subject :  kesempatan, Frequency : 1
Verb : membantu, Subject :  perusahaan pembuat†kebijakan, Frequency : 1
Verb : Begitu, Subject : , Frequency : 1
Verb : dilakukan, Subject :  banyak†hal, Frequency : 1
Verb : terbatas, Subject :  startup waktu sumber daya, Frequency : 1
Verb : mendanai, Subject :  Play†membantu fokus, Frequency : 1
Verb : ujar, Subject : , Frequency : 1
Verb : membantu, Subject : , Frequency : 1
Verb : mengembangkan, Subject : , Frequency : 1
Verb : menembus, Subject :  strategi bisnis ìSelama†program penjualan, Frequency : 1
Verb : ujar, Subject :  angka berkat perubahan strategi†pemasaran, Frequency : 1
Verb : bertemu, Subject :  ìIkut program Play†memberi kesempatan, Frequency : 1
Verb : membutuhkan, Subject :  perusahaan, Frequency : 1
Verb : Melalui, Subject : , Frequency : 1
Verb : membuat, Subject : , Frequency : 1
Verb : ìujar, Subject :  kerjasama portal di†Indonesia, Frequency : 1
Verb : berkarya, Subject :  Sembari mengakselerasi startup, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : mitra, Subject :  Paulus Bambang Direktur Astra perusahaan, Frequency : 1
Verb : mengikuti, Subject :  Indonesia†mengatakan, Frequency : 1
Verb : berbicara, Subject : , Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : Melalui, Subject : , Frequency : 1
Verb : mengatakan, Subject :  Wesley Harjono selaku Presiden Direktur Indonesia, Frequency : 1
Verb : ini†ditujukan, Subject :  ìDemo Day hari, Frequency : 1
Verb : bekerjasama, Subject :  kesembilan startup, Frequency : 1
Verb : berharap, Subject : , Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : bertemu, Subject :  Indonesia, Frequency : 1
Verb : klien,†mitra, Subject :  calon, Frequency : 1
Verb : diberikan, Subject :  dukungan, Frequency : 1
Verb : mengatakan, Subject :  Jupe Tan selaku Managing Partner Play Asia Pacific, Frequency : 1
Verb : berada, Subject :  ìPlug sangat†senang, Frequency : 1
Verb : bekerja, Subject :  Jakarta, Frequency : 1
Verb : startup, Subject : , Frequency : 1
Verb : menemukan, Subject : , Frequency : 1
Verb : startup, Subject : , Frequency : 1
Verb : danai, Subject : , Frequency : 1
Verb : bimbing, Subject : , Frequency : 1
Verb : Melihat, Subject : , Frequency : 1
Verb : dimulai, Subject :  kesuksesan program akselerator gelombang Indonesia saat membuka†pendaftaran gelombang rencananya, Frequency : 1
Verb : startup, Subject :  tahun mengakselerasi, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : mendukung, Subject :  usaha, Frequency : 1
Verb : menjadikan, Subject :  inisiatif†Presiden Jokowi, Frequency : 1
Verb : ingin, Subject :  Indonesia pemimpin ekonomi Asia Tenggara,î ucap†Nayoko Wicaksono Direktur Akselerator Play Indonesia Startup, Frequency : 1
Verb : mendaftarkan, Subject :  mendapatkan†pendanaan pembinaan, Frequency : 1
Verb : melalui, Subject :  diri online, Frequency : 1
Verb : menjaga, Subject :  bukti komitmen, Frequency : 1
Verb : menjadi, Subject :  kepercayaan publik transparansi informasi Modalku, Frequency : 1
Verb : memeriksa, Subject :  perusahaan peer-to-peer P2P lending Indonesia diaudit firma kelompok audit Ernst Keberadaan jasa auditor, Frequency : 1
Verb : menjadi, Subject :  laporan keuangan, Frequency : 1
Verb : meningkatkan, Subject :  upaya Modalku, Frequency : 1
Verb : terdiri, Subject :  laporan keuangan Modalku PT Mitrausaha Indonesia Grup, Frequency : 1
Verb : berakhir, Subject :  laporan posisi keuangan laporan laba penghasilan laporan perubahan ekuitas laporan arus kas informasi penjelasan lainnya tahun, Frequency : 1
Verb : &, Subject :  Desember diaudit KAP Purwantono Sungkoro, Frequency : 1
Verb : wajar, Subject :  Surja firma Anggota Global Limited pendapat laporan keuangan, Frequency : 1
Verb : merupakan, Subject :  Saat Modalku, Frequency : 1
Verb : terdaftar, Subject :  Juni Modalku, Frequency : 1
Verb : menunjukkan, Subject :  Otoritas Jasa Keuangan OJK Terdaftarnya Modalku OJK keberhasilan audit firma audit dunia, Frequency : 1
Verb : mendapatkan, Subject :  Modalku, Frequency : 1
Verb : menegaskan, Subject :  kepercayaan pemerintah publik, Frequency : 1
Verb : mengumumkan, Subject :  bulan September Modalku, Frequency : 1
Verb : menjadikan, Subject :  perjanjian kustodian Bank Sinarmas Kerja, Frequency : 1
Verb : pendanaannya, Subject :  Modalku perusahaan†P2P Indonesia, Frequency : 1
Verb : dijaga, Subject : , Frequency : 1
Verb : terjamin, Subject :  bank kustodian keamanan transparansi dananya, Frequency : 1
Verb : mengatakan, Subject :  Reynold Wijaya Co-Founder CEO Modalku, Frequency : 1
Verb : mencapai, Subject :  ìTim Modalku, Frequency : 1
Verb : ingin, Subject :  hal, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : terjadi, Subject :  inovasi, Frequency : 1
Verb : menjunjung, Subject :  tim, Frequency : 1
Verb : menggunakan, Subject :  standar integritas, Frequency : 1
Verb : memeriksa, Subject :  jasa auditor independen, Frequency : 1
Verb : memberikan, Subject :  laporan keuangan Modalku, Frequency : 1
Verb : merupakan, Subject :  memenangkan† kepercayaan publik pemerintah, Frequency : 1
Verb : menjadi, Subject :  ìSalah hal, Frequency : 1
Verb : dilindungi, Subject :  perhatian regulator soal dunia†P2P lending†adalah perlindungan dana pelanggan Apabila dana konsumen, Frequency : 1
Verb : disalahgunakan, Subject :  dana, Frequency : 1
Verb : mengeluarkan, Subject :  kasus-kasus†Ponzi scheme layanan keuangan, Frequency : 1
Verb : menjadi, Subject :  jasa audit potensi penipuan data penyalahgunaan dana, Frequency : 1
Verb : tambah, Subject : , Frequency : 1
Verb : menyediakan, Subject : , Frequency : 1
Verb : dipertemukan, Subject :  layanan†P2P lending UMKM berpotensi pencari investasi alternatif, Frequency : 1
Verb : mendanai, Subject : , Frequency : 1
Verb : mendapatkan, Subject :  pinjaman UMKM pemberi pinjaman Modalku, Frequency : 1
Verb : dibandingkan, Subject :  alternatif investasi, Frequency : 1
Verb : mendapatkan, Subject :  sisi UMKM peminjam, Frequency : 1
Verb : kerap, Subject :  persoalan, Frequency : 1
Verb : dihadapi, Subject : , Frequency : 1
Verb : adalah, Subject :  seorang pelaku bisnis, Frequency : 1
Verb : mendukung, Subject :  laporan keuangan, Frequency : 1
Verb : berjalan, Subject :  proses bisnis, Frequency : 1
Verb : memonitor, Subject :  Misalnya laporan keuangan tersaji kesulitan, Frequency : 1
Verb : mencatat, Subject :  antarcabang kesulitan mengontrol stok, Frequency : 1
Verb : jual, Subject :  transaksi penjualan menganalisanya mengimplementasi aplikasi keuangan laporan kas keuangan update purna, Frequency : 1
Verb : mengkhawatirkan, Subject : , Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : memerlukan, Subject :  Manajer Bisnis PT Zahir Internasional Indra Septiady seorang pelaku usaha, Frequency : 1
Verb : mengembangkan, Subject :  laporan keuangan, Frequency : 1
Verb : duduk, Subject :  ìBayangkan sebuah laporan keuangan bisa diakses realtime, Frequency : 1
Verb : manapun, Subject :  manis, Frequency : 1
Verb : tinggal, Subject : , Frequency : 1
Verb : diterapkan, Subject :  Teknologi inilah, Frequency : 1
Verb : kata, Subject :  Zahir Online,î, Frequency : 1
Verb : menambahkan, Subject : , Frequency : 1
Verb : mempunyai, Subject :  Zahir Online, Frequency : 1
Verb : menjawab, Subject :  keunggulan, Frequency : 1
Verb : terkait, Subject :  kebutuhan seorang pengusaha, Frequency : 1
Verb : ìZahir, Subject :  pembuatan laporan keuangan perusahaan real-time, Frequency : 1
Verb : digunakan, Subject :  Online, Frequency : 1
Verb : mulai, Subject :  bidang usaha, Frequency : 1
Verb : tersedia, Subject :  diakses smartphone terintegrasi aplikasi bisnis Fitur-fitur penjualan persediaan analisa bisnis aktiva, Frequency : 1
Verb : mengungkapkan, Subject : , Frequency : 1
Verb : menggunakan, Subject :  perusahaan, Frequency : 1
Verb : berada, Subject :  ìSaat, Frequency : 1
Verb : Terkait, Subject :  era budaya serba online, Frequency : 1
Verb : menghadirkan, Subject :  hal, Frequency : 1
Verb : memudahkan, Subject :  Zahir Online, Frequency : 1
Verb : ujar, Subject :  pengusaha mengelola keuangan, Frequency : 1
Verb : menegaskan, Subject : , Frequency : 1
Verb : dikenal, Subject :  Zahir Online, Frequency : 1
Verb : memudahkan, Subject :  pelayanan support jam, Frequency : 1
Verb : menggunakan, Subject :  customer, Frequency : 1
Verb : kata, Subject :  Hal, Frequency : 1
Verb : dibuktikan, Subject :  Indra, Frequency : 1
Verb : dilaksanakan, Subject :  event Zahir Business Festival, Frequency : 1
Verb : hadirkan, Subject : , Frequency : 1
Verb : dibuka, Subject :  event tempat Mall Gandaria City Summarecon Mall Serpong Mall Taman Anggrek Mall Kelapa Gading Mall Ambassador Jakarta Acara, Frequency : 1
Verb : menyambut, Subject :  rangka, Frequency : 1
Verb : mengadakan, Subject :  bulan September Mister Aladin, Frequency : 1
Verb : mendukung, Subject :  promo ìLucky Septemberî, Frequency : 1
Verb : meningkat, Subject :  minat masyarakat Indonesia, Frequency : 1
Verb : berlibur, Subject : , Frequency : 1
Verb : tanggal, Subject :  Singapura, Frequency : 1
Verb : berkesempatan, Subject :  September nanti konsumen Mister Aladin, Frequency : 1
Verb : memenangkan, Subject : , Frequency : 1
Verb : menginap, Subject : , Frequency : 1
Verb : dipilih, Subject :  pemenang, Frequency : 1
Verb : berdasarkan, Subject : , Frequency : 1
Verb : dilakukan, Subject :  kode pemesanan, Frequency : 1
Verb : Melalui, Subject : , Frequency : 1
Verb : memberikan, Subject :  promo ìLucky Septemberî Mister Aladin, Frequency : 1
Verb : berlaku, Subject :  diskon hotel negeri, Frequency : 1
Verb : melalui, Subject :  pemesanan, Frequency : 1
Verb : menginap, Subject :  website aplikasi Mister Aladin periode, Frequency : 1
Verb : melakukan, Subject :  konsumen, Frequency : 1
Verb : berlangsung, Subject :  pemesanan hotel promo, Frequency : 1
Verb : berkesempatan, Subject : , Frequency : 1
Verb : memenangkan, Subject : , Frequency : 1
Verb : menginap, Subject : , Frequency : 1
Verb : melakukan, Subject :  konsumen, Frequency : 1
Verb : memenangkan, Subject :  pemesanan kesempatan, Frequency : 1
Verb : menginap, Subject : , Frequency : 1
Verb : ìSingapura, Subject : , Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : berlibur, Subject :  tujuan, Frequency : 1
Verb : memilih, Subject :  orang, Frequency : 1
Verb : kata, Subject :  Singapura Bali tujuan negeri lainnya rata-rata harga tiket, Frequency : 1
Verb : melihat, Subject :  Nitha Sudewo Chief Operating Officer Mister Aladin waktu bulan belakangan, Frequency : 1
Verb : menjadikan, Subject :  adanya peningkatan pemesanan hotel, Frequency : 1
Verb : wisata, Subject :  Singapura tujuan, Frequency : 1
Verb : diikuti, Subject :  negeri nomor, Frequency : 1
Verb : meningkat, Subject :  Tren, Frequency : 1
Verb : menjadi, Subject :  masa Idulfitri, Frequency : 1
Verb : berlibur, Subject :  momen orang, Frequency : 1
Verb : melakukan, Subject :  konsumen, Frequency : 1
Verb : dipesan, Subject :  pemesanan hotel minggu hotel, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : wisata, Subject :  hotel keluarga objek, Frequency : 1
Verb : melihat, Subject : , Frequency : 1
Verb : berlanjut, Subject :  tren, Frequency : 1
Verb : tambah, Subject : , Frequency : 1
Verb : berharap, Subject :  Nitha promo, Frequency : 1
Verb : merencanakan, Subject :  masyarakat, Frequency : 1
Verb : berkesan, Subject :  liburan tahun Singapura hemat, Frequency : 1
Verb : merupakan, Subject : , Frequency : 1
Verb : mengalami, Subject :  sektor industri Indonesia, Frequency : 1
Verb : Berdasarkan, Subject :  perkembangan, Frequency : 1
Verb : dikeluarkan, Subject :  data, Frequency : 1
Verb : naik, Subject :  Kementerian Pariwisata kontribusi sektor pariwisata Produk Bruto PDB, Frequency : 1
Verb : menjadi, Subject :  tahun, Frequency : 1
Verb : menjadi, Subject :  Hal, Frequency : 1
Verb : didukung, Subject :  potensi, Frequency : 1
Verb : memaksimalkan, Subject : , Frequency : 1
Verb : berdampak, Subject :  pertumbuhan ekonomi negara, Frequency : 1
Verb : membantu, Subject :  kesejahteraan masyarakat Indonesia †Di faktor, Frequency : 1
Verb : mendorong, Subject : , Frequency : 1
Verb : menjadi, Subject :  potensi industri technology(fintech, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : jual, Subject :  peran proses, Frequency : 1
Verb : beli, Subject : , Frequency : 1
Verb : memesan, Subject :  transaksi Misalnya hadirnya†fintech†sekarang seorang turis, Frequency : 1
Verb : melalui, Subject :  tiket pesawat kamar hotel, Frequency : 1
Verb : ada, Subject :  sebuah aplikasi, Frequency : 1
Verb : mendorong, Subject :  ìFintech†sangat berpotensi, Frequency : 1
Verb : memberi, Subject :  pertumbuhan sektor pariwisata, Frequency : 1
Verb : dilakukan, Subject :  kemudahan akses transaksi Dengan†fintech, Frequency : 1
Verb : melakukan, Subject :  inovasi metode pembayaran segala urusan perjalanan pariwisata turis, Frequency : 1
Verb : wisata, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  Hal lah, Frequency : 1
Verb : ujar, Subject :  daya tarik pariwisata Indonesia,î, Frequency : 1
Verb : lah, Subject :  Fenomena, Frequency : 1
Verb : membahas, Subject :  mendorong†Fintech Connect†untuk, Frequency : 1
Verb : merupakan, Subject :  Fintech Connect†sendiri, Frequency : 1
Verb : diinisiasi, Subject :  sebuah platform diskusi, Frequency : 1
Verb : mengundang, Subject :  Lab Kinetic BNVLabs, Frequency : 1
Verb : duduk, Subject :  pembicara sektor industri, Frequency : 1
Verb : pegiat†fintech†membahas, Subject :  berjejaring, Frequency : 1
Verb : mengangkat, Subject : , Frequency : 1
Verb : dilaksanakan, Subject :  tema †ìTourism Unravel Travel Industryî,†Fintech Connect†kali, Frequency : 1
Verb : membahas, Subject :  ìSetelah edisi, Frequency : 1
Verb : mengangkat, Subject :  industri logistik,†Fintech Connect†kali, Frequency : 1
Verb : menjadi, Subject :  sektor pariwisata potensi ekonomi Indonesia, Frequency : 1
Verb : Ada, Subject : , Frequency : 1
Verb : jejaknya, Subject :  peluang, Frequency : 1
Verb : Melalui, Subject :  dunia pariwisata, Frequency : 1
Verb : dan†startup†terkait, Subject :  diskusi pegiat†fintech,†developer, Frequency : 1
Verb : ditemukan,î, Subject :  solusi-solusi, Frequency : 1
Verb : lanjut, Subject :  Adhi, Frequency : 1
Verb : mengundang, Subject :  Fintech Connect†kali, Frequency : 1
Verb : Memberikan, Subject : , Frequency : 1
Verb : merupakan, Subject :  pengalaman pelanggan, Frequency : 1
Verb : diutamakan, Subject :  hal, Frequency : 1
Verb : memenuhi, Subject :  AXIS, Frequency : 1
Verb : bekerjasama, Subject :  kepuasan pelanggan, Frequency : 1
Verb : menghadirkan, Subject :  UnlockD AXIS, Frequency : 1
Verb : bernama, Subject :  sebuah aplikasi, Frequency : 1
Verb : membantu, Subject :  ìSWAPPSî, Frequency : 1
Verb : menggunakan, Subject :  pelanggan AXIS, Frequency : 1
Verb : menghemat, Subject :  smartphone OS Andriod, Frequency : 1
Verb : bulannya, Subject :  pengeluaran pulsa, Frequency : 1
Verb : berlangsung, Subject :  Peluncuran aplikasi, Frequency : 1
Verb : mengatakan, Subject :  Juli 2017 Singapura David Arcelus Chief Marketing Officer XL Axiata, Frequency : 1
Verb : mencari, Subject :  ìAXIS, Frequency : 1
Verb : membangun, Subject :  cara, Frequency : 1
Verb : memberikan, Subject :  loyalitas pelanggan, Frequency : 1
Verb : mengabaikan, Subject :  penawaran pelanggan, Frequency : 1
Verb : berhemat, Subject :  kesempatan, Frequency : 1
Verb : menabung, Subject : , Frequency : 1
Verb : dimiliki, Subject : , Frequency : 1
Verb : ditukar, Subject : , Frequency : 1
Verb : mendapatkan, Subject : , Frequency : 1
Verb : berhemat, Subject : , Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : melihat, Subject :  Pelanggan, Frequency : 1
Verb : menarik, Subject :  iklan berita penawaran, Frequency : 1
Verb : muncul, Subject :  lainnya, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : dimilikinya, Subject :  layar smartphone, Frequency : 1
Verb : melakukan, Subject : , Frequency : 1
Verb : mendapatkan†reward†yang, Subject :  hal, Frequency : 1
Verb : ditukarkan, Subject :  nantinya, Frequency : 1
Verb : didapatkan, Subject :  Aplikasi SWAPPS, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : lanjut, Subject :  Penjelasan, Frequency : 1
Verb : mengenai, Subject : , Frequency : 1
Verb : idapatkan, Subject :  aplikasi, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : mengatakan, Subject :  Aliza Knox COO UnlockD, Frequency : 1
Verb : merupakan, Subject :  ìPeluncuran SWAPPS Indonesia, Frequency : 1
Verb : bekerjasama, Subject : , Frequency : 1
Verb : memberikan, Subject :  dengan†brand†inovatif AXIS, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : raih, Subject :  cara menggunakan†smartphone dan† pertumbuhan, Frequency : 1
Verb : membuktikan, Subject :  pasar, Frequency : 1
Verb : memahami, Subject :  hal, Frequency : 1
Verb : bergantung, Subject :  segmen anak, Frequency : 1
Verb : dihadirkan, Subject : , Frequency : 1
Verb : miliki, Subject :  smartphone, Frequency : 1
Verb : memberikan, Subject :  SWAPPS, Frequency : 1
Verb : memanfatkan, Subject :  pengalaman, Frequency : 1
Verb : dimilikinya, Subject :  perangkat, Frequency : 1
Verb : merupakan, Subject : , Frequency : 1
Verb : berbasis, Subject :  perusahaan pembangunan platform advertising konten, Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : ciptakan, Subject :  Aliza layanan berbasis†win-win, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : menggunakan, Subject :  manfaat pelanggan perusahaan-perusahaan telko, Frequency : 1
Verb : berharap, Subject : , Frequency : 1
Verb : menghadirkan, Subject :  kerjasama AXIS unlockD, Frequency : 1
Verb : memberikan, Subject :  SWAPPS aplikasi, Frequency : 1
Verb : diikuti, Subject :  Peluncuran aplikasi SWAAPS, Frequency : 1
Verb : mendorong, Subject :  investasi Axiata Group Malaysia Unlockd, Frequency : 1
Verb : berkembang, Subject :  Unlockd Series B, Frequency : 1
Verb : merupakan, Subject :  Asia Pasific, Frequency : 1
Verb : diperkirakan, Subject :  area kunci pertumbuhan UnlockD GSMA, Frequency : 1
Verb : memiliki, Subject :  saat, Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : mengambil, Subject :  eMarketer April pertumbuhan terkuat industry, Frequency : 1
Verb : mendorong, Subject :  tempat Indonesia Filipina Malaysia Thailand Cina India Vietnam total, Frequency : 1
Verb : bermitra, Subject : , Frequency : 1
Verb : menjalin, Subject :  Bank Mandiri kali Amartha, Frequency : 1
Verb : merupakan, Subject : , Frequency : 1
Verb : diberikan, Subject :  BUMN, Frequency : 1
Verb : menjamin, Subject :  mandat Pemerintah, Frequency : 1
Verb : menjadi, Subject :  kredit pembiayaan transaksi segmen SME mikro segmen, Frequency : 1
Verb : menjadi, Subject :  Kerjasama, Frequency : 1
Verb : merupakan, Subject :  Amartha, Frequency : 1
Verb : bekerjasama, Subject :  perusahaan teknologi keuangan fintech Indonesia, Frequency : 1
Verb : memberi, Subject : , Frequency : 1
Verb : diharapkan, Subject :  keamanan investor Amartha kerjasama, Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : melalui, Subject :  kepercayaan publik bertransaksi, Frequency : 1
Verb : diwakili, Subject :  Bertempat kantor Jamkrindo Amartha, Frequency : 1
Verb : diwakili, Subject :  Founder & CEO Andi Taufan Garuda Putra Jamkrindo, Frequency : 1
Verb : menandatangani, Subject :  Direktur Bisnis Bakti Prasetyo, Frequency : 1
Verb : disalurkan, Subject :  dokumen penjaminan kredit, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : menyampaikan, Subject :  platform P2P amartha.com kesempatan Bakti, Frequency : 1
Verb : merupakan, Subject :  ìKerjasama Amartha, Frequency : 1
Verb : ingin, Subject :  peluang Jamkrindo, Frequency : 1
Verb : mengikuti, Subject : , Frequency : 1
Verb : memberi, Subject :  perkembangan zaman teknologi teknologi, Frequency : 1
Verb : merupakan, Subject :  Amartha, Frequency : 1
Verb : menyalurkan, Subject :  platform P2P Indonesia, Frequency : 1
Verb : membantu, Subject :  pendanaanya masyarakat prasejahtera pelosok Indonesia, Frequency : 1
Verb : menciptakan, Subject : , Frequency : 1
Verb : Menggunakan, Subject : , Frequency : 1
Verb : berbasis, Subject :  approach pendampingan pembiayaan, Frequency : 1
Verb : dilengkapi, Subject :  kelompok, Frequency : 1
Verb : tanggung, Subject :  sistem, Frequency : 1
Verb : menjaga, Subject :  renteng Amartha, Frequency : 1
Verb : bayar, Subject :  tingkat, Frequency : 1
Verb : beroperasi, Subject :  tahun, Frequency : 1
Verb : Melalui, Subject : , Frequency : 1
Verb : ingin, Subject :  kerjasama Jamkrindo Amartha, Frequency : 1
Verb : memastikan, Subject : , Frequency : 1
Verb : berlapis, Subject :  risiko investasi Amartha dikelola proteksi, Frequency : 1
Verb : mulai, Subject : , Frequency : 1
Verb : terjadi, Subject :  ikatan collateral penjaminan kredit, Frequency : 1
Verb : bayar, Subject : , Frequency : 1
Verb : memiliki, Subject :  Hal pernyataan Bakti ìMasyarakat, Frequency : 1
Verb : membayar, Subject : , Frequency : 1
Verb : diedukasi, Subject :  terjangkau, Frequency : 1
Verb : berbasis, Subject :  Pendekatan Amartha, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : membuat, Subject :  solusinyaî ìMitigasi risiko, Frequency : 1
Verb : bekerjasama, Subject : , Frequency : 1
Verb : tambah, Subject :  Amartha,î, Frequency : 1
Verb : mengenai, Subject : , Frequency : 1
Verb : diragukan, Subject :  Kapabilitas Perum Jamkrindo, Frequency : 1
Verb : mengklaim, Subject : , Frequency : 1
Verb : mencapai, Subject :  nilai ekuitasnya, Frequency : 1
Verb : merupakan, Subject :  selain Jamkrindo, Frequency : 1
Verb : turut, Subject :  Hendrikus Passagi Direktur Pengaturan Perizinan Pengawasan Fintech, Frequency : 1
Verb : mendukung, Subject : , Frequency : 1
Verb : harusnya, Subject : , Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  kemudahan kecepatan hal akses pendanaan UMKM, Frequency : 1
Verb : merupakan, Subject :  kenyamanan keamanan bertransaksi ìKerjasama Amartha Jamkrindo, Frequency : 1
Verb : berharga, Subject : , Frequency : 1
Verb : mendorong, Subject : , Frequency : 1
Verb : terciptanya, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  ekosistem ekonomi Indonesia, Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : diharapkan, Subject :  Hendrikus langkah Amartha, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : diharapkan, Subject :  contoh pengembangan industri tanah air, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : terdaftar, Subject :  Mei Amartha, Frequency : 1
Verb : diawasi, Subject : , Frequency : 1
Verb : memacu, Subject :  Amartha kerjasama, Frequency : 1
Verb : tumbuh, Subject :  Amartha, Frequency : 1
Verb : melayani, Subject : , Frequency : 1
Verb : tahu, Subject : , Frequency : 1
Verb : mendapatkan, Subject : , Frequency : 1
Verb : memiliki, Subject :  pinjaman, Frequency : 1
Verb : mempertemukan, Subject :  kelayakan kredit Amartha hadir, Frequency : 1
Verb : berinvestasi, Subject :  investor mau, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : menyalurkan, Subject :  penjaminan kredit investor, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : turut, Subject :  pionir skema penjaminan kredit Amartha, Frequency : 1
Verb : mendorong, Subject : , Frequency : 1
Verb : diharapkan, Subject :  Hal, Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : berinvestasi, Subject :  minat publik, Frequency : 1
Verb : melalui, Subject :  usaha mikro, Frequency : 1
Verb : berinvestasi, Subject :  ìSaat masyarakat, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : menciptakan, Subject :  platform fintech lending skema penjaminan Jamkrindo Amartha, Frequency : 1
Verb : Menciptakan, Subject : , Frequency : 1
Verb : didukung, Subject :  ekosistem terpercaya, Frequency : 1
Verb : mencapai, Subject :  BUMN bidangnya, Frequency : 1
Verb : ujar, Subject :  inklusi keuangan kesejahteraan, Frequency : 1
Verb : memberikan, Subject :  upaya, Frequency : 1
Verb : menengah, Subject :  dukungan kemajuan pelaku usaha mikro, Frequency : 1
Verb : menghadirkan, Subject :  UMKM Telkomsel, Frequency : 1
Verb : memberikan, Subject :  MyAds Platform beriklan konsep do-it-yourself, Frequency : 1
Verb : membuat, Subject :  keleluasaan pelaku UMKM pengiklan, Frequency : 1
Verb : iklannya, Subject :  mengkustomisasi, Frequency : 1
Verb : melalui, Subject :  Lewat Telkomsel MyAds pelaku UMKM Indonesia menjangkau konsumen, Frequency : 1
Verb : mencapai, Subject :  pengguna Telkomsel jumlahnya, Frequency : 1
Verb : mengatakan, Subject :  Vice President Analytics Telkomsel Harris Wijaya, Frequency : 1
Verb : memiliki, Subject :  ìSektor UMKM, Frequency : 1
Verb : mendorong, Subject :  peranan, Frequency : 1
Verb : mengurangi, Subject :  pembangunan pertumbuhan ekonomi Indonesia, Frequency : 1
Verb : berupaya, Subject :  operator Indonesia, Frequency : 1
Verb : turut, Subject : , Frequency : 1
Verb : membantu, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  sektor UMKM, Frequency : 1
Verb : melalui, Subject :  produktivitasnya menjangkau konsumen, Frequency : 1
Verb : berharap, Subject : , Frequency : 1
Verb : membantu, Subject :  layanan, Frequency : 1
Verb : merangsang, Subject : , Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : dimudahkan, Subject :  layanan Telkomsel MyAds pengiklan, Frequency : 1
Verb : membuat, Subject : , Frequency : 1
Verb : mengirimkan, Subject : , Frequency : 1
Verb : melalui, Subject :  iklan pelanggan Telkomsel perangkat selulernya, Frequency : 1
Verb : mengkustomisasi, Subject :  pengguna platform, Frequency : 1
Verb : kebutuhannya, Subject :  iklan, Frequency : 1
Verb : ditawarkan, Subject :  keunggulan layanan, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : memungkinkan, Subject :  layanan beriklan, Frequency : 1
Verb : mengirimkan, Subject :  pengiklan, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : memberikan, Subject :  layanan beriklan, Frequency : 1
Verb : mengirimkan, Subject :  keleluasaan pengiklan, Frequency : 1
Verb : dimiliki, Subject :  iklan jumlah bulk data kebutuhan, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : memberikan, Subject :  layanan beriklan, Frequency : 1
Verb : mengirimkan, Subject :  keleluasaan pengiklan, Frequency : 1
Verb : dibutuhkan, Subject :  iklan pelanggan Telkomsel profil, Frequency : 1
Verb : adalah, Subject :  Interactive, Frequency : 1
Verb : memungkinkan, Subject :  layanan beriklan, Frequency : 1
Verb : mengirimkan, Subject :  pengiklan, Frequency : 1
Verb : digunakan, Subject :  iklan pelanggan Telkomsel, Frequency : 1
Verb : memperkuat, Subject :  kuis survei berpotensi, Frequency : 1
Verb : memberikan, Subject :  samping keunggulan Telkomsel MyAds, Frequency : 1
Verb : bervariasi, Subject :  pilihan metode pembayaran, Frequency : 1
Verb : mulai, Subject : , Frequency : 1
Verb : ada, Subject :  layanan keuangan Telkomsel TCASH kartu kredit transfer rekening bank Saat, Frequency : 1
Verb : mendukung, Subject :  bank, Frequency : 1
Verb : melalui, Subject :  metode pembayaran, Frequency : 1
Verb : merangkul, Subject :  saat Telkomsel MyAds fokus, Frequency : 1
Verb : depannya, Subject :  pasar UMKM, Frequency : 1
Verb : menutup, Subject : , Frequency : 1
Verb : bekerja, Subject :  kemungkinan, Frequency : 1
Verb : lepas, Subject : , Frequency : 1
Verb : diintegrasikan, Subject :  Application Programming Interface API layanan Telkomsel MyAds, Frequency : 1
Verb : bekerja, Subject :  sistem perusahaan, Frequency : 1
Verb : memilih, Subject :  ìDi Telkomsel MyAds pengiklan, Frequency : 1
Verb : iklannya, Subject :  kinerja, Frequency : 1
Verb : mengintegrasikan, Subject :  layanan MyAds web, Frequency : 1
Verb : ada, Subject :  sistem, Frequency : 1
Verb : sediakan, Subject :  API, Frequency : 1
Verb : jelas, Subject :  pengiklan kinerja iklannya sistem, Frequency : 1
Verb : menyelesaikan, Subject :  Berdasar†hasil survei terkini dirilis SAP SE pemimpin bisnis, Frequency : 1
Verb : mencatat, Subject :  proyek transformasi organisasi, Frequency : 1
Verb : dibandingkan, Subject :  peningkatan hal produktivitas karyawan, Frequency : 1
Verb : beragam, Subject :  Enam persen inisiatif, Frequency : 1
Verb : menyatakan, Subject : , Frequency : 1
Verb : dilibatkan, Subject :  karyawan, Frequency : 1
Verb : dibandingkan, Subject : , Frequency : 1
Verb : bekerja, Subject :  persen lainnya, Frequency : 1
Verb : bergantung, Subject :  Transformasi, Frequency : 1
Verb : menyoroti, Subject :  orang hal, Frequency : 1
Verb : mendorong, Subject :  investasi tenaga kerja, Frequency : 1
Verb : dibuat, Subject :  Pengumuman, Frequency : 1
Verb : berlangsung, Subject :  acara SuccessConnect, Frequency : 1
Verb : diselenggarakan, Subject :  ìFour Ways Leaders Set Themselves Apart,î sebuah studi transformasi, Frequency : 1
Verb : menilai, Subject :  SAP Center for Business Insight Oxford Economics mensurvei pengambil keputusan bisnis, Frequency : 1
Verb : mendorong, Subject :  prioritas, Frequency : 1
Verb : dilakukan, Subject :  Hasil penelitian, Frequency : 1
Verb : menunjukkan, Subject : , Frequency : 1
Verb : mencolok, Subject :  adanya perbedaan, Frequency : 1
Verb : mengadopsi, Subject :  organisasi-organisasi sukses bertransformasi, Frequency : 1
Verb : berharap, Subject :  persen pemimpin sukses bertransformasi, Frequency : 1
Verb : dibandingkan, Subject :  Angka, Frequency : 1
Verb : memulai, Subject :  persen organisasi, Frequency : 1
Verb : memiliki, Subject :  Responden sukses bertransformasi bisnis, Frequency : 1
Verb : mengenai, Subject :  pandangan, Frequency : 1
Verb : menyatakan, Subject :  manfaat proses SDM persen, Frequency : 1
Verb : memudahkan, Subject :  digitalisasi, Frequency : 1
Verb : mempertahankan, Subject : , Frequency : 1
Verb : dibandingkan, Subject :  bakat, Frequency : 1
Verb : mengalami, Subject :  persen bisnis, Frequency : 1
Verb : mengatakan, Subject :  proyek transformasi, Frequency : 1
Verb : merencanakan, Subject : , Frequency : 1
Verb : menciptakan, Subject : , Frequency : 1
Verb : mencerminkan, Subject :  lowongan-lowongan, Frequency : 1
Verb : dibandingkan, Subject :  kebutuhan teknologi tahun depan, Frequency : 1
Verb : melakukan, Subject :  persen perusahaan, Frequency : 1
Verb : mengutamakan, Subject :  ìPerusahaan-perusahaan hari, Frequency : 1
Verb : kata, Subject :  karyawan inti strategi transformasi, Frequency : 1
Verb : menunjukkan, Subject :  ìPenelitian, Frequency : 1
Verb : bergantung, Subject :  keberhasilan digitalisasi, Frequency : 1
Verb : berpandangan, Subject :  orang-orang perusahaan, Frequency : 1
Verb : berinvestasi, Subject :  depan komitmen, Frequency : 1
Verb : memastikan, Subject :  karyawan, Frequency : 1
Verb : dibekali, Subject :  angkatan kerja perusahaan, Frequency : 1
Verb : menghadapi, Subject : , Frequency : 1
Verb : mencakup, Subject :  Penemuan-penemuan lainnya laporan, Frequency : 1
Verb : merupakan, Subject :  perusahaan manajemen pengembangan karyawan, Frequency : 1
Verb : menjadi, Subject :  persen investasi keterampilan karyawan, Frequency : 1
Verb : terpenting, Subject : , Frequency : 1
Verb : meningkatkan, Subject : , Frequency : 1
Verb : mendatang, Subject :  pendapatan tahun-tahun, Frequency : 1
Verb : menunjukkan, Subject :  Sektor perbankan, Frequency : 1
Verb : meningkatkan, Subject :  komitmen, Frequency : 1
Verb : terpenting, Subject :  persen mencantumkannya faktor, Frequency : 1
Verb : mendorong, Subject : , Frequency : 1
Verb : menilai, Subject :  pertumbuhan laba persen sektor jasa, Frequency : 1
Verb : memiliki, Subject :  Transformasi, Frequency : 1
Verb : dibandingkan, Subject :  dampak retensi pengembangan bakat organisasi-organisasi Amerika Serikat, Frequency : 1
Verb : mitra-mitra, Subject : , Frequency : 1
Verb : menyatakan, Subject :  persen perusahaan Amerika disurvei, Frequency : 1
Verb : mengubah, Subject :  pembaruan teknologi, Frequency : 1
Verb : dibandingkan, Subject :  proses manajemen karyawan, Frequency : 1
Verb : menunjukkan, Subject :  Studi, Frequency : 1
Verb : terbayarkan, Subject :  komitmen transformasi, Frequency : 1
Verb : memuaskan, Subject :  hasil amat, Frequency : 1
Verb : Dibandingkan, Subject : , Frequency : 1
Verb : memiliki, Subject :  perusahaan disurvei pemimpin, Frequency : 1
Verb : berlanjut, Subject :  pertumbuhan pendapatan profitabilitas ñ keuntungan kemungkinan, Frequency : 1
Verb : memperkirakan, Subject :  tahun depan Faktanya pemimpin, Frequency : 1
Verb : mengatakan, Subject :  pertumbuhan pendapatan persen lainnya tahun depan persen pemimpin, Frequency : 1
Verb : meningkatkan, Subject :  upaya transformasi, Frequency : 1
Verb : dibandingkan, Subject : , Frequency : 1
Verb : berinvestasi, Subject :  ìTransformasi, Frequency : 1
Verb : kata, Subject :  teknologi, Frequency : 1
Verb : bekerja, Subject :  ñ, Frequency : 1
Verb : ketahui, Subject : , Frequency : 1
Verb : butuhkan, Subject :  keterampilan, Frequency : 1
Verb : berubah, Subject :  tempat kerja, Frequency : 1
Verb : mulai, Subject :  perusahaan, Frequency : 1
Verb : mengatasi, Subject : , Frequency : 1
Verb : tertinggal, Subject :  faktor-faktor, Frequency : 1
Verb : menyusul, Subject :  pernah, Frequency : 1
Verb : meraih, Subject : , Frequency : 1
Verb : memperkuat, Subject :  performa bisnis paruh Shopee Indonesia, Frequency : 1
Verb : memberikan, Subject :  pasar kategori elektronik, Frequency : 1
Verb : beragam, Subject : , Frequency : 1
Verb : menjadi, Subject :  Berbelanja online produk elektronik, Frequency : 1
Verb : menyenangkan, Subject : , Frequency : 1
Verb : Berburu, Subject :  Kampanye ìSeptember Brutal Bulan, Frequency : 1
Verb : berlangsung, Subject :  Digitalî, Frequency : 1
Verb : beragam, Subject :  periode pengguna Shopee menikmatidiskon hingga, Frequency : 1
Verb : kirim, Subject :  produk elektronik ongkos, Frequency : 1
Verb : berupaya, Subject :  Chris Feng CEO Shopee†mengatakan ìShopee, Frequency : 1
Verb : menyesuaikan, Subject : , Frequency : 1
Verb : pembeli, Subject :  inisiatif kebutuhan penjual, Frequency : 1
Verb : mendedikasikan, Subject : , Frequency : 1
Verb : menikmati, Subject :  Kampanye September Brutal penggemar teknologi bulan, Frequency : 1
Verb : beragam, Subject :  penawaran, Frequency : 1
Verb : membeli, Subject :  Kampanye September Brutal pengguna, Frequency : 1
Verb : mulai, Subject :  produk elektronik harga terjangkau, Frequency : 1
Verb : mengikuti, Subject :  TV kamera produk penyimpanan peralatan rumah tangga laptop aksesorisnya produk†game online, Frequency : 1
Verb : menawarkan, Subject :  tren terkini Shopee, Frequency : 1
Verb : melalui, Subject :  harga ponsel aksesorisnya, Frequency : 1
Verb : terdapat, Subject : , Frequency : 1
Verb : Melengkapi, Subject : , Frequency : 1
Verb : mengajak, Subject :  kampanye Shopee, Frequency : 1
Verb : mengikuti, Subject : , Frequency : 1
Verb : memenangkan, Subject :  kompetisi foto, Frequency : 1
Verb : dan†voucher†belanja, Subject :  hadiah Nikon J5 Camera Canon Powershot Fuji Instax Mini, Frequency : 1
Verb : senilai, Subject : , Frequency : 1
Verb : berbelanja, Subject :  mengunggah ekspresi kegembiraan, Frequency : 1
Verb : menjadi, Subject :  ìKategori elektronik, Frequency : 1
Verb : berharap, Subject :  kategori terfavorit pengguna Indonesia, Frequency : 1
Verb : mendorong, Subject :  kampanye, Frequency : 1
Verb : menjadikan, Subject :  pengguna, Frequency : 1
Verb : belanja, Subject :  Shopee pilihan destinasi, Frequency : 1
Verb : mendapatkan, Subject :  online, Frequency : 1
Verb : memberikan, Subject :  Kedepannya Shopee berkomitmen, Frequency : 1
Verb : belanja, Subject : , Frequency : 1
Verb : menyenangkan, Subject :  online, Frequency : 1
Verb : memberikan, Subject :  pengguna, Frequency : 1
Verb : menandatangani, Subject :  Investree PT Investree Radhika Jaya Kamar Dagang Industri Provinsi Jawa Tengah Kadin Jateng Agustus, Frequency : 1
Verb : diadakan, Subject :  Perjanjian Kerjasama Kemitraan, Frequency : 1
Verb : merupakan, Subject :  Kerjasama, Frequency : 1
Verb : mengembangkan, Subject :  langkah lanjutan strategi bisnis Investree jangkauan layanan UMKM Jawa Tengah sekitarnya sejalan visi misi belah pihak, Frequency : 1
Verb : meningkatkan, Subject :  Usaha Mikro Menengah UMKM Jawa Tengah sekitarnya, Frequency : 1
Verb : dilakukan, Subject :  Bentuk kolaborasi, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : mereferensikan, Subject :  Kadin Jateng, Frequency : 1
Verb : merekomendasikan, Subject : , Frequency : 1
Verb : mensosialisasikan, Subject : , Frequency : 1
Verb : mitra, Subject :  produk jasa layanan Investree anggota, Frequency : 1
Verb : menjadi, Subject :  afiliasi berprospek, Frequency : 1
Verb : pinjam, Subject :  pengguna layanan, Frequency : 1
Verb : meminjam, Subject : , Frequency : 1
Verb : berbasis, Subject : , Frequency : 1
Verb : disediakan, Subject :  teknologi informasi atau†peer-to-peer lending†yang, Frequency : 1
Verb : mitra, Subject :  Nantinya anggota, Frequency : 1
Verb : mendaftar, Subject :  afiliasi Kadin Jateng, Frequency : 1
Verb : menggunakan, Subject :  www investree.id†sebagai†Business Borrower†(melalui Pinjaman Bisnis atau†Personal Borrower†(melalui Pembiayaan Personal Karyawan, Frequency : 1
Verb : disiapkan, Subject :  kode†referral†khusus, Frequency : 1
Verb : mengatakan, Subject :  Adrian Asharyanto Gunadi selaku†Co-Founder & CEO†Investree, Frequency : 1
Verb : menyambut, Subject : , Frequency : 1
Verb : berterima, Subject :  kerjasama, Frequency : 1
Verb : diterima, Subject :  kasih keberadaan pionir†peer-to-peer lending marketplace†bisa, Frequency : 1
Verb : merasa, Subject :  Investree, Frequency : 1
Verb : dipercayai, Subject :  terhormat, Frequency : 1
Verb : mencapai, Subject :  Kadin Jateng, Frequency : 1
Verb : memberdayakan, Subject :  tujuan, Frequency : 1
Verb : terciptanya, Subject :  UMKM Jawa Tengah sekitarnya, Frequency : 1
Verb : terdorong, Subject :  adanya kerjasama Investree, Frequency : 1
Verb : menggencarkan, Subject : , Frequency : 1
Verb : memperbaiki, Subject :  jangkauan layanan Jawa Tengah sekitarnya, Frequency : 1
Verb : meraih, Subject :  arus kas, Frequency : 1
Verb : diinginkan, Subject :  tujuan, Frequency : 1
Verb : turut, Subject :  Kukrit Suryo Wicaksono Ketua Kadin Jateng, Frequency : 1
Verb : mengutarakan, Subject : , Frequency : 1
Verb : ìMelalui, Subject :  respons membangunnya, Frequency : 1
Verb : menjadi, Subject :  kerjasama Investree teknologi, Frequency : 1
Verb : didapatkan, Subject :  jawaban masalah ekonomi akses pembiayaan, Frequency : 1
Verb : menengah, Subject :  pengusaha mikro, Frequency : 1
Verb : diusung, Subject :  inovasi†peer-to-peer lending†yang, Frequency : 1
Verb : menghadirkan, Subject :  Investree, Frequency : 1
Verb : pinjam, Subject : , Frequency : 1
Verb : meminjam, Subject : , Frequency : 1
Verb : dibandingkan, Subject : , Frequency : 1
Verb : berjalan, Subject :  institusi keuangan perkembangan UMKM, Frequency : 1
Verb : meningkat, Subject :  informasi terkini kontribusi UMKM Produk Bruto PDB, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : menunjukkan, Subject :  Kenaikan angka, Frequency : 1
Verb : pentingnya, Subject : , Frequency : 1
Verb : mendorong, Subject :  dukungan UMKM, Frequency : 1
Verb : mendapatkan, Subject :  pelaku UMKM, Frequency : 1
Verb : mudahókebanyakan, Subject :  akses keuangan, Frequency : 1
Verb : tersandung, Subject : , Frequency : 1
Verb : diharapkan, Subject :  masalah jaminan itu,†peer-to-peer lending platform†Investree, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : mengatasi, Subject :  solusi, Frequency : 1
Verb : berharap, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  kehadiran Investree Jawa Tengah sekitarnya, Frequency : 1
Verb : menikmati, Subject :  mengakses†website†Investree pelaku usaha, Frequency : 1
Verb : pinjam, Subject : , Frequency : 1
Verb : meminjam, Subject : , Frequency : 1
Verb : berhadapan, Subject : , Frequency : 1
Verb : prosedur, Subject : , Frequency : 1
Verb : agunan,î, Subject :  persyaratan, Frequency : 1
Verb : Bertepatan, Subject : , Frequency : 1
Verb : meluncurkan, Subject :  peringatan ulang tahun Kemerdekaan RI Ruangguru perusahaan teknologi pendidikan lokal Indonesia, Frequency : 1
Verb : ditujukan, Subject :  Layanan, Frequency : 1
Verb : memudahkan, Subject : , Frequency : 1
Verb : belajar-mengajar, Subject :  guru mengelola aktivitas, Frequency : 1
Verb : mengundang, Subject :  kelas Guru, Frequency : 1
Verb : diajarnya, Subject :  murid, Frequency : 1
Verb : bergabung, Subject : , Frequency : 1
Verb : memberikan, Subject :  ruangkelas, Frequency : 1
Verb : dibuat, Subject :  tugas ulangan konten, Frequency : 1
Verb : memanfaatkan, Subject : , Frequency : 1
Verb : melihat, Subject :  bank soal Ruangguru, Frequency : 1
Verb : belajar, Subject :  hasil perkembangan, Frequency : 1
Verb : merupakan, Subject :  ìPeluncuran ruangkelas, Frequency : 1
Verb : mewujudkan, Subject :  inovasi, Frequency : 1
Verb : bertujuan, Subject :  kelas masa depan, Frequency : 1
Verb : mempermudah, Subject : , Frequency : 1
Verb : belajar-mengajar, Subject :  guru kegiatan, Frequency : 1
Verb : menjadi, Subject :  kinerja guru, Frequency : 1
Verb : Ujar, Subject :  efisien,î, Frequency : 1
Verb : bekerja, Subject :  semangat kolaborasi ruangkelas guru, Frequency : 1
Verb : menciptakan, Subject : , Frequency : 1
Verb : digunakan, Subject :  konten-konten pendidikan nantinya, Frequency : 1
Verb : belajar-mengajar, Subject :  kegiatan, Frequency : 1
Verb : menggunakan, Subject :  Misalnya guru Jakarta, Frequency : 1
Verb : dibuat, Subject :  soal, Frequency : 1
Verb : meningkatnya, Subject :  Harapannya, Frequency : 1
Verb : meningkat, Subject :  kolaborasi konten pendidikan Indonesia, Frequency : 1
Verb : merata, Subject : , Frequency : 1
Verb : mengadakan, Subject :  tahap Ruangguru, Frequency : 1
Verb : menjadi, Subject :  Guru-guru, Frequency : 1
Verb : diharapkan, Subject :  guru pionir pengguna ruangkelas, Frequency : 1
Verb : membimbing, Subject : , Frequency : 1
Verb : depannya, Subject : , Frequency : 1
Verb : diberikan, Subject :  kesempatan, Frequency : 1
Verb : mengucapkan, Subject : , Frequency : 1
Verb : terima, Subject : , Frequency : 1
Verb : memberikan, Subject :  kasih Ruangguru, Frequency : 1
Verb : belajar, Subject :  Pelatihan bermanfaat sekolah penggunaan teknologi kegiatan, Frequency : 1
Verb : mengajar, Subject : , Frequency : 1
Verb : memberikan, Subject :  blog, Frequency : 1
Verb : Ujar, Subject :  tugas murid, Frequency : 1
Verb : mengukuhkan, Subject :  Peluncuran layanan, Frequency : 1
Verb : terlengkap, Subject :  Ruangguru perusahaan teknologi pendidikan, Frequency : 1
Verb : memiliki, Subject :  Ruangguru saat, Frequency : 1
Verb : belajar, Subject :  layanan pendidikan lainnya RuangLes,†market-place†guru privat RuangLesOnline layanan bimbingan, Frequency : 1
Verb : berbasis, Subject :  online Ruangguru Bootcamp ñ solusi pendidikan pembelajaran jarak, Frequency : 1
Verb : chat, Subject : , Frequency : 1
Verb : bekerja, Subject :  RuangUji layanan ujian online Selain Ruangguru, Frequency : 1
Verb : berkualitas, Subject :  pemerintah provinsi pemerintah kota kabupaten Indonesia pendorong pemerataan akses pendidikan, Frequency : 1
Verb : memanfaatkan, Subject : , Frequency : 1
Verb : memberikan, Subject :  perangkat elektronik Ruangguru, Frequency : 1
Verb : berkualitas, Subject :  akses konten pendidikan, Frequency : 1
Verb : mengadakan, Subject : , Frequency : 1
Verb : bertajuk, Subject : , Frequency : 1
Verb : mengaperiasi, Subject :  Dirjen Aplikasi Informatika Semuel A Pangerapan, Frequency : 1
Verb : menjelaskan, Subject :  Kaskus, Frequency : 1
Verb : merupakan, Subject : , Frequency : 1
Verb : mematuhi, Subject :  platform online, Frequency : 1
Verb : mendorong, Subject :  UU ITE tahun, Frequency : 1
Verb : berinternet, Subject : , Frequency : 1
Verb : sehat, Subject : , Frequency : 1
Verb : mengambil, Subject :  ìSaat Kaskus, Frequency : 1
Verb : menutup, Subject :  langkah, Frequency : 1
Verb : ditandai, Subject :  Langkah tersebut† diapresiasi pengguna internet Indonesia hal, Frequency : 1
Verb : meningkat, Subject : , Frequency : 1
Verb : pesatnya, Subject : , Frequency : 1
Verb : menunjukkan, Subject :  Data pengguna internet tahun, Frequency : 1
Verb : berusia, Subject :  peren penduduk Indonesia, Frequency : 1
Verb : adalah, Subject :  ñ †tahun anak, Frequency : 1
Verb : menambahkan, Subject :  Dirjen Semuel, Frequency : 1
Verb : menjadi, Subject :  dengan†target pengunjung gelaran Market & Komunitas Markas Kaskus, Frequency : 1
Verb : dilakukan, Subject :  bukti hal, Frequency : 1
Verb : menyebarkan, Subject : , Frequency : 1
Verb : memberikan, Subject :  hal, Frequency : 1
Verb : menyebarkan, Subject :  penghargaan setinggi-tingginya penyelenggaraan acara Markas, Frequency : 1
Verb : adalah, Subject :  tren pengguna Internet Indonesia, Frequency : 1
Verb : katanya, Subject :  kegiatan, Frequency : 1
Verb : menyampaikan, Subject :  Andrew Darwis, Frequency : 1
Verb : berlangsung, Subject :  pelaksanaan MARKAS, Frequency : 1
Verb : dikatakan, Subject :  26-27 Agustus, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : dimiliki, Subject :  kekuatan KASKUS, Frequency : 1
Verb : telihat, Subject :  Kekuatan, Frequency : 1
Verb : katanya, Subject :  adanya pertemuan kegiatan kopdar forum komunitas daring Indonesia,î, Frequency : 1
Verb : diharapkan, Subject :  Penyelenggaraan MARKAS 2017, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : mengenal, Subject :  komunitas kopdar, Frequency : 1
Verb : diharapkan, Subject :  Kehadiran MARKAS, Frequency : 1
Verb : memfasilitasi, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  kebutuhan, Frequency : 1
Verb : dukung, Subject :  ìKita happy ñ happy kenalan komunitas ilmu selebgram, Frequency : 1
Verb : jualannya, Subject : , Frequency : 1
Verb : dilihat, Subject :  temen ñ temen, Frequency : 1
Verb : jual, Subject :  dilapak online, Frequency : 1
Verb : beli, Subject : , Frequency : 1
Verb : sampai, Subject : , Frequency : 1
Verb : ujar, Subject :  dengerin lagu ñ lagu hits musisi Indonesiaî, Frequency : 1
Verb : menjadi, Subject :  Pemilihan tempat area Bintaro Xchange Tangerang Selatan, Frequency : 1
Verb : datang, Subject :  nilai berdasarkan† riset forum Kaskus area keaktifan komunitas otomotifnya ìPengunjung, Frequency : 1
Verb : dikatakan, Subject :  MARKAS, Frequency : 1
Verb : datang, Subject :  pengunjung, Frequency : 1
Verb : keserun, Subject :  Kaskus veri Offline, Frequency : 1
Verb : dirakan, Subject : , Frequency : 1
Verb : merupakan, Subject :  pengunjung, Frequency : 1
Verb : menarik, Subject :  cerminan keseruan keragaman KASKUS Online harapan, Frequency : 1
Verb : bergabung, Subject :  pengunjung non-Kaskuser, Frequency : 1
Verb : ungkap, Subject :  forum kamií, Frequency : 1
Verb : mengusung, Subject :  Acara MARKAS, Frequency : 1
Verb : dihadiri, Subject :  konsel ìOnline Offlineî, Frequency : 1
Verb : berangkat, Subject :  MARKAS, Frequency : 1
Verb : menghadirkan, Subject :  Market Komunitas Market Kaskus kali, Frequency : 1
Verb : diramaikan, Subject :  area pengunjung Playground, Frequency : 1
Verb : menghadirkan, Subject :  olh teenat bazaar F&B lifestyle fashion promo Happy Hour Libe Auction Community Lounge, Frequency : 1
Verb : diramaikan, Subject :  area Otoground, Frequency : 1
Verb : juga†Sunday†Morning, Subject :  ragam modification showcase Cellograffiti performance Pinstripping art performance, Frequency : 1
Verb : terkait, Subject :  Pemerintah stakeholder, Frequency : 1
Verb : mencoba, Subject : , Frequency : 1
Verb : mewujudkan, Subject : , Frequency : 1
Verb : melalui, Subject :  kedaulatan, Frequency : 1
Verb : dikuasai, Subject :  Kondisi saat dominasi aplikasi konten, Frequency : 1
Verb : menuntut, Subject :  pihak Hal, Frequency : 1
Verb : dibahas, Subject :  Persoalan kedaulatan, Frequency : 1
Verb : ìMenuju, Subject :  acara Ngopi Museum Perumusan Naskah Proklamasi tema, Frequency : 1
Verb : Melalui, Subject :  Kedaulatan Indonesia, Frequency : 1
Verb : menilai, Subject :  Menteri Komunikasi Informatika Rudiantara, Frequency : 1
Verb : didefinisikan, Subject :  kedaulatan Indonesia, Frequency : 1
Verb : tambah, Subject :  penganut nilai nilai, Frequency : 1
Verb : gunakan, Subject :  proses bisnis, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : rumuskan, Subject :  Indonesia teknologi pola pikir kedaulatan, Frequency : 1
Verb : merumuskan, Subject : , Frequency : 1
Verb : chauvinistik, Subject :  kedaulatan, Frequency : 1
Verb : disebutkan, Subject :  Pendapatan aplikasi pasar Indonesia per tahun, Frequency : 1
Verb : mencapai, Subject :  Ketua Tim Pelaksana Dewan Teknologi Informasi Komunikasi Ilham A Habibie, Frequency : 1
Verb : mendorong, Subject :  Hal, Frequency : 1
Verb : menjaga, Subject :  pemerintah, Frequency : 1
Verb : mendorong, Subject :  kepentingan, Frequency : 1
Verb : berkembangnya, Subject : , Frequency : 1
Verb : menurut, Subject : , Frequency : 1
Verb : suka, Subject :  Menkominfo masyarakat, Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : jaga, Subject :  aplikasi, Frequency : 1
Verb : mendorong, Subject :  Peran Kominfo, Frequency : 1
Verb : berkembang, Subject :  aplikasi lokal, Frequency : 1
Verb : dimiliki, Subject : , Frequency : 1
Verb : dimanfaatkan,î, Subject :  pemerintah, Frequency : 1
Verb : ujar, Subject : , Frequency : 1
Verb : Ditambahkan, Subject : , Frequency : 1
Verb : adalah, Subject :  Deputi Infrastruktur Bekraf Hari Santosa Sungkari ekonomi, Frequency : 1
Verb : terkait, Subject : , Frequency : 1
Verb : berupa, Subject :  Hak Kekayaan Intelektual HKI, Frequency : 1
Verb : dipegang, Subject :  merk hak paten hak cipta HKI, Frequency : 1
Verb : terbiasa, Subject :  ìSelama, Frequency : 1
Verb : tambah, Subject :  nilai, Frequency : 1
Verb : terpenting, Subject : , Frequency : 1
Verb : rumuskan, Subject : , Frequency : 1
Verb : mengubah, Subject :  kedaulatan bisa, Frequency : 1
Verb : dijelaskan, Subject :  Kedaulatan, Frequency : 1
Verb : meliputi, Subject :  Ilham, Frequency : 1
Verb : mencakup, Subject :  dalamnya, Frequency : 1
Verb : mendukung, Subject :  penguasaan HKI antarmuka konsumen penguasaan kemampuan teknologi kebijakan, Frequency : 1
Verb : diharapkan, Subject :  Acara Ngopi Museum Perumusan Naskah Proklamasi, Frequency : 1
Verb : mewujudkan, Subject : , Frequency : 1
Verb : memperkuat, Subject : , Frequency : 1
Verb : berkembang, Subject :  Indonesia, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : bermunculan, Subject :  sebuah bangsa inovasi, Frequency : 1
Verb : memenuhi, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  kebutuhan manusia, Frequency : 1
Verb : mendongkrak, Subject :  organisasi mengandalkan†Digital Marketing†sebagai strategi, Frequency : 1
Verb : berkaitan, Subject :  kinerja, Frequency : 1
Verb : menjadi, Subject :  Penerapan teknologi, Frequency : 1
Verb : termasuk, Subject :  strategi individu pelaku bisnis, Frequency : 1
Verb : mengharuskan, Subject :  Perkembangan, Frequency : 1
Verb : memberikan, Subject :  media meningkatan efisiensi produktivitas, Frequency : 1
Verb : hidup, Subject :  fashion gaya, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : berlaku, Subject :  tren tahunnya perkembangan tren, Frequency : 1
Verb : membuat, Subject :  Era disruptif, Frequency : 1
Verb : melakukan, Subject :  dunia usaha organisasi, Frequency : 1
Verb : mendatang, Subject :  adaptasi tren masa, Frequency : 1
Verb : mendorong, Subject :  Hal, Frequency : 1
Verb : mengadakan, Subject :  IM3 Ooredoo, Frequency : 1
Verb : menghadirkan, Subject :  tema†ìAre You Wave?î†khusus media komunitas Jakarta hari, Frequency : 1
Verb : membuat, Subject :  Perubahan perilaku masyarakat kebutuhan internet kecepatan informasi, Frequency : 1
Verb : menghadirkan, Subject :  Indosat Ooredoo, Frequency : 1
Verb : melalui, Subject :  produk layanan, Frequency : 1
Verb : didapatkan, Subject :  IM3 Ooredoo paket, Frequency : 1
Verb : berlangganan, Subject :  Stream streaming musik Spotify nonton jam film TV Pelanggan, Frequency : 1
Verb : takut, Subject :  paket internet kuota, Frequency : 1
Verb : hilang, Subject :  sisa kuota, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : ekstra, Subject :  Apps Kuota kuota, Frequency : 1
Verb : digunakan, Subject : , Frequency : 1
Verb : menyampaikan, Subject :  Sharif Mahfoedz Division Head Core Indosat Ooredoo, Frequency : 1
Verb : ingin, Subject :  ìDi IM3 Ooredoo, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : menyenangkan, Subject :  pengalaman, Frequency : 1
Verb : memberikan, Subject :  saat, Frequency : 1
Verb : memberikan, Subject :  produk, Frequency : 1
Verb : dikeluarkan, Subject :  manfaat nilai uang, Frequency : 1
Verb : dimiliki, Subject :  keuntungan, Frequency : 1
Verb : ada, Subject :  operator, Frequency : 1
Verb : Melalui, Subject : , Frequency : 1
Verb : ingin, Subject :  seminar, Frequency : 1
Verb : meningkat, Subject :  pemahaman dunia, Frequency : 1
Verb : digunakan, Subject : , Frequency : 1
Verb : menjawab, Subject : , Frequency : 1
Verb : dihadapi, Subject :  tantangan, Frequency : 1
Verb : diberikan, Subject :  Manfaat lainnya, Frequency : 1
Verb : adalah, Subject :  IM3 Ooredoo, Frequency : 1
Verb : membeli, Subject :  bonus kuota internet 10GB jaringan pelanggan, Frequency : 1
Verb : memperpanjang, Subject :  paket, Frequency : 1
Verb : menikmati, Subject :  Pelanggan, Frequency : 1
Verb : mulai, Subject :  kebebasan internetan bonus kuota, Frequency : 1
Verb : menghadirkan, Subject :  IM3 Ooredoo, Frequency : 1
Verb : sepuasnya, Subject :  paket tambahan Obrol paket nelpon, Frequency : 1
Verb : dinikmati, Subject :  Paket tambahan Obrol, Frequency : 1
Verb : tersedia, Subject :  pengguna Kartu Perdana prabayar, Frequency : 1
Verb : menikmati, Subject :  pilihan paket kebutuhan harga terjangkau Pelanggan, Frequency : 1
Verb : membeli, Subject :  nelpon sepuasnya sesama pengguna Ooredoo, Frequency : 1
Verb : mulai, Subject :  paket Obrol tarif, Frequency : 1
Verb : meluncurkan, Subject :  Operator Indonesia Indosat Ooredoo hari, Frequency : 1
Verb : diberi, Subject :  aplikasi terbarunya, Frequency : 1
Verb : berisi, Subject :  nama iMabrur, Frequency : 1
Verb : membantu, Subject :  panduan, Frequency : 1
Verb : memudahkan, Subject : , Frequency : 1
Verb : digunakan, Subject :  Aplikasi iMabrur, Frequency : 1
Verb : mengginakan, Subject :  masyarakat nomor operator, Frequency : 1
Verb : termasuk, Subject :  jaringan data operator, Frequency : 1
Verb : menikmati, Subject :  Wi-Fi, Frequency : 1
Verb : diperlukan, Subject :  aplikasi, Frequency : 1
Verb : memahami, Subject :  Kehadiran aplikasi komitmen Indosat Ooredoo, Frequency : 1
Verb : menunaikan, Subject :  kebutuhan pelanggannya, Frequency : 1
Verb : didambakan, Subject : , Frequency : 1
Verb : diciptakan, Subject :  îiMabrur semenjak, Frequency : 1
Verb : membantu, Subject : , Frequency : 1
Verb : melaksanakan, Subject :  jemaah haji umrah, Frequency : 1
Verb : ungkap, Subject :  ibadahnya haji umrah,î, Frequency : 1
Verb : hadirnya, Subject : , Frequency : 1
Verb : dimudahkan, Subject :  aplikasi iMabrur jemaah haji umrah kian, Frequency : 1
Verb : beribadah, Subject : , Frequency : 1
Verb : tersedia, Subject :  aplikasi, Frequency : 1
Verb : berbasis, Subject :  telepon pintar, Frequency : 1
Verb : diluncurkan, Subject :  Android sistem operasi iOS, Frequency : 1
Verb : mengunduh, Subject :  pelanggan, Frequency : 1
Verb : melalui, Subject :  aplikasi, Frequency : 1
Verb : menggunakan, Subject :  Google Play Store, Frequency : 1
Verb : kata, Subject : , Frequency : 1
Verb : bekerja, Subject :  Aplikasi, Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : menyediakan, Subject :  Aplikasi iMabrur, Frequency : 1
Verb : termasuk, Subject :  fitur, Frequency : 1
Verb : menjalankan, Subject :  Panduan Haji Umrah panduan langkah per langkah, Frequency : 1
Verb : mulai, Subject :  Jemaah dipandu, Frequency : 1
Verb : disiapkan, Subject :  sebelum keberangkatan hal-hal, Frequency : 1
Verb : menjalankan, Subject :  tata cara doa doa, Frequency : 1
Verb : sampai, Subject :  haji umrah doa tawaf wukuf saíi sebagainya, Frequency : 1
Verb : pulang, Subject : , Frequency : 1
Verb : menyediakan, Subject :  iMabrur, Frequency : 1
Verb : berisi, Subject :  Kumpulan Doa, Frequency : 1
Verb : dibutuhkan, Subject :  koleksi doa-doa doa doa, Frequency : 1
Verb : menghadirkan, Subject :  bagian Persiapan Haji Umrah aplikasi iMabrur, Frequency : 1
Verb : membantu, Subject :  artikel-artikel, Frequency : 1
Verb : dilengkapi, Subject :  Aplikasi, Frequency : 1
Verb : menampilkan, Subject :  Map Interaktif, Frequency : 1
Verb : masuk, Subject :  peta Masjidil Haram lokasi, Frequency : 1
Verb : menyediakan, Subject :  Aplikasi iMabrur, Frequency : 1
Verb : melihat, Subject :  fitur Friend Tracking jemaah, Frequency : 1
Verb : melacak, Subject : , Frequency : 1
Verb : menjalankan, Subject :  posisi suami isteri anak kerabat teman seperjalanan, Frequency : 1
Verb : memudahkan, Subject : , Frequency : 1
Verb : menambahkan, Subject :  jemaah iMabrur, Frequency : 1
Verb : berupa, Subject :  fitur Tips Perjalanan, Frequency : 1
Verb : mendukung, Subject :  artikel, Frequency : 1
Verb : melaksanakan, Subject :  perjalanan jemaah, Frequency : 1
Verb : belanja, Subject :  haji umrah lokasi, Frequency : 1
Verb : membeli, Subject : , Frequency : 1
Verb : berisi, Subject :  kamus, Frequency : 1
Verb : kata, Subject : , Frequency : 1
Verb : digunakan, Subject :  Bahasa Arab, Frequency : 1
Verb : menyertakan, Subject :  Aplikasi iMabrur, Frequency : 1
Verb : berupa, Subject : , Frequency : 1
Verb : terkait, Subject :  kumpulan nomor-nomor kontak, Frequency : 1
Verb : memudahkan, Subject :  penyelenggaraan perjalanan haji umrah Saudi Arabia panduan aplikasi, Frequency : 1
Verb : mencari, Subject :  jemaah, Frequency : 1
Verb : dibutuhkan, Subject :  informasi, Frequency : 1
Verb : menyediakan, Subject :  pengguna Indosat Ooredoo iMabrur, Frequency : 1
Verb : diaktifkan, Subject :  fitur layanan komunikasi Promo Paket Haji, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : mendapatkan, Subject :  Selain pengguna kartu Indosat Ooredoo, Frequency : 1
Verb : berupaya, Subject :  îIndosat Ooredoo, Frequency : 1
Verb : memenuhi, Subject : , Frequency : 1
Verb : pelanggannya, Subject : , Frequency : 1
Verb : merupakan, Subject :  lewat inovasi Hadirnya aplikasi iMabrur, Frequency : 1
Verb : wujud, Subject : , Frequency : 1
Verb : memasuki, Subject :  komitmen berinovasi pelanggan masyarakat usia perusahaan, Frequency : 1
Verb : melayani, Subject :  usia tahun, Frequency : 1
Verb : memudahkan, Subject : , Frequency : 1
Verb : meluncurkan, Subject :  akses telekomunikasi jemaah haji Indonesia Indosat Ooredoo, Frequency : 1
Verb : memberi, Subject :  Paket promo hemat lengkap, Frequency : 1
Verb : ada, Subject :  garansi†no bill shock tarif jaminan, Frequency : 1
Verb : lonjakan, Subject : , Frequency : 1
Verb : berada, Subject :  pemakaian data, Frequency : 1
Verb : dinikmati, Subject :  kemudahan, Frequency : 1
Verb : melakukan, Subject :  pelanggan, Frequency : 1
Verb : didukung, Subject :  pengaturan, Frequency : 1
Verb : berlaku, Subject :  jaringan jangkauan kualitas, Frequency : 1
Verb : ada, Subject :  perator, Frequency : 1
Verb : mendukung, Subject :  Ketua MPR Zulkifli Hasan, Frequency : 1
Verb : mencari, Subject :  aplikasi Qsoft, Frequency : 1
Verb : memahami, Subject :  data, Frequency : 1
Verb : mendukung, Subject : , Frequency : 1
Verb : dipahami, Subject :  start up Al Qurían sekedar dibaca nilai-nilainya, Frequency : 1
Verb : diaplikasikan, Subject : , Frequency : 1
Verb : disampaikan, Subject :  Hal, Frequency : 1
Verb : menerima, Subject :  Zulkifli Hasan, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : diakui, Subject : , Frequency : 1
Verb : memasyarakat, Subject :  aplikasi, Frequency : 1
Verb : mendukung, Subject : , Frequency : 1
Verb : memahami, Subject : , Frequency : 1
Verb : ujarnya, Subject :  Al Qurían baik,î, Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : belajar, Subject :  aplikasi, Frequency : 1
Verb : tambahnya, Subject :  agama Islam utuh,î, Frequency : 1
Verb : mengapresiasi, Subject :  Zulkifli Hasan, Frequency : 1
Verb : memanfaatkan, Subject :  tim pengembang Qsoft, Frequency : 1
Verb : membantu, Subject :  teknologi, Frequency : 1
Verb : memahami, Subject :  orang, Frequency : 1
Verb : gunakan, Subject :  ìSaya baca Qurían smartphone salut anak, Frequency : 1
Verb : mempermudah, Subject :  teknologi, Frequency : 1
Verb : pahami, Subject : , Frequency : 1
Verb : mendukung, Subject :  PT XL Axiata Tbk XL Axiata berkomitmen, Frequency : 1
Verb : menyiapkan, Subject :  pemerintah, Frequency : 1
Verb : memasuki, Subject :  masyarakat Indonesia, Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : menyiapkan, Subject : , Frequency : 1
Verb : memanfaatkan, Subject :  masyarakat nelayan, Frequency : 1
Verb : mendorong, Subject :  teknologi, Frequency : 1
Verb : meningkatkan, Subject :  produktivitas, Frequency : 1
Verb : bekerjasama, Subject :  hasil tangkapan ikan, Frequency : 1
Verb : mendukung, Subject :  Kementerian Kelautan Perikanan KKP Republik Indonesia Kementerian Komunikasi Informatika Republik Indonesia XL Axiata, Frequency : 1
Verb : terlaksana, Subject :  Implementasi, Frequency : 1
Verb : dilaksanakan, Subject :  Makasssar Medan bulan Agustus 2017 Medan penyaluran program, Frequency : 1
Verb : mengatakan, Subject :  Vice President XL Axiata West Region Francky Rinaldo Pakpahan, Frequency : 1
Verb : mendukung, Subject :  ìXL Axiata, Frequency : 1
Verb : memanfaatkan, Subject :  implementasi Program Nelayan Go Online, Frequency : 1
Verb : menjadi, Subject :  Dukungan, Frequency : 1
Verb : mendukung, Subject :  bagian komitmen XL Axiata, Frequency : 1
Verb : menyediakan, Subject :  program XL Axiata, Frequency : 1
Verb : memanfaatkan, Subject :  akses layanan Data nelayan, Frequency : 1
Verb : mengimplementasikan, Subject :  Selain Medan, Frequency : 1
Verb : memperluaskan, Subject :  program Makassar Jawa Timur, Frequency : 1
Verb : berharap, Subject : , Frequency : 1
Verb : dimanfaatkan, Subject :  sarana, Frequency : 1
Verb : meningkatkan, Subject :  nelayan Medan, Frequency : 1
Verb : memiliki, Subject :  Aplikasi NELPIN, Frequency : 1
Verb : mendukung, Subject :  fitur, Frequency : 1
Verb : bekerja, Subject :  aktivitas nelayan, Frequency : 1
Verb : mengetahui, Subject :  melaut, Frequency : 1
Verb : menyediakan, Subject :  Fitur, Frequency : 1
Verb : berkumpulnya, Subject :  informasi arah kecepatan angin gelombang posisi/koordinat nelayan GPS lokasi, Frequency : 1
Verb : tersedia, Subject :  Selain, Frequency : 1
Verb : terkait, Subject : , Frequency : 1
Verb : dirancang, Subject :  harga ikan terupdate permintaan jenis-jenis ikan Aplikasi NELPIN, Frequency : 1
Verb : ditargetkan, Subject :  Kementerian KKP, Frequency : 1
Verb : dimanfaatkan, Subject : , Frequency : 1
Verb : penerima, Subject :  nelayan, Frequency : 1
Verb : mendapatkan, Subject :  manfaat, Frequency : 1
Verb : mendukung, Subject :  sisi jaringan, Frequency : 1
Verb : menyediakan, Subject :  pengoperasian NELPIN XL Axiata, Frequency : 1
Verb : memadai, Subject :  layanan LTE, Frequency : 1
Verb : lepas, Subject :  Jaringan menjangkau, Frequency : 1
Verb : menangkap, Subject :  pantai tempat nelayan, Frequency : 1
Verb : memanfaatkan, Subject :  iklan, Frequency : 1
Verb : disalurkan, Subject :  Medan Makassar perangkat bantuan, Frequency : 1
Verb : bertahap, Subject : , Frequency : 1
Verb : mengembangkan, Subject :  Seiring visi pemerintah, Frequency : 1
Verb : melalui, Subject :  program Nelayan Go Online, Frequency : 1
Verb : mendukung, Subject :  pengenalan aplikasi NELPIN Indonesia XL Axiata, Frequency : 1
Verb : berharap, Subject :  XL Axiata, Frequency : 1
Verb : diperoleh, Subject :  manfaat, Frequency : 1
Verb : dilakukan, Subject :  nelayan Indonesia Pengembangan program seiring perluasan jaringan Data saat, Frequency : 1
Verb : termasuk, Subject :  XL Axiata daerah Indonesia, Frequency : 1
Verb : merupakan, Subject :  Dukungan XL Axiata program Nelayan Go Online, Frequency : 1
Verb : menyiapkan, Subject :  implementasi komitmen, Frequency : 1
Verb : memasuki, Subject :  masyarakat Indonesia kalangan, Frequency : 1
Verb : membangun, Subject :  XL Axiata sekedar, Frequency : 1
Verb : tercantum, Subject :  infrastruktur telekomunikasi pemenuhan kewajiban, Frequency : 1
Verb : membangun, Subject :  licensing upaya, Frequency : 1
Verb : memberikan, Subject :  ekosistem kehadiran jaringan Data pelosok daerah, Frequency : 1
Verb : meningkatkan, Subject :  manfaat daerah masyarakat setempat, Frequency : 1
Verb : termasuk, Subject :  kualitas hidupnya, Frequency : 1
Verb : merayakan, Subject :  Ideabox Akselerator pemenang penghargaan Indonesia, Frequency : 1
Verb : melalui, Subject :  startups Andalin Ayoslide Stylecation sukses, Frequency : 1
Verb : menandai, Subject :  hari mentoring konsultasi pakar bisnis industri Kelulusan, Frequency : 1
Verb : berakhirnya, Subject : , Frequency : 1
Verb : dimulai, Subject :  program akselerasi, Frequency : 1
Verb : mengumumkan, Subject : , Frequency : 1
Verb : menyelesaikan, Subject : , Frequency : 1
Verb : membantu, Subject :  Program, Frequency : 1
Verb : membukakan, Subject : , Frequency : 1
Verb : menjalin, Subject :  pintu, Frequency : 1
Verb : mengembangkan, Subject :  kerjasama perusahaan-perusahaan bereputasi industrinya, Frequency : 1
Verb : menambahkan, Subject :  layanan jaringan mereka,îdemikian disampaikan Prashant Chief Innovation Indosat Tbk Prashant, Frequency : 1
Verb : ìSesungguhnya, Subject : , Frequency : 1
Verb : adalah, Subject :  tantangan, Frequency : 1
Verb : memiliki, Subject :  program akselerasi selesai Indosat Ooredoo, Frequency : 1
Verb : mendukung, Subject :  komitmen jangka, Frequency : 1
Verb : melalui, Subject :  Startup-startup Ideabox, Frequency : 1
Verb : mengembangkan, Subject :  dukungan market, Frequency : 1
Verb : memulai, Subject :  bisnis, Frequency : 1
Verb : ada, Subject :  diskusi perusahaan saat, Frequency : 1
Verb : gembira, Subject :  Mountain Partners, Frequency : 1
Verb : meluluskan, Subject :  Ideabox, Frequency : 1
Verb : menempatkan, Subject :  startup-startup Andalin Ayoslide Stylecation, Frequency : 1
Verb : membuktikan, Subject :  perusahaan, Frequency : 1
Verb : matang, Subject :  ekosistem stratup Indonesia, Frequency : 1
Verb : berkelanjutan, Subject : , Frequency : 1
Verb : mencetak, Subject : , Frequency : 1
Verb : memberikan, Subject :  Indosat Ooredoo Kejora, Frequency : 1
Verb : menantikan, Subject :  dukungan talen-talen lokal pengembanga kewirausahaan, Frequency : 1
Verb : berikutnya,îdisampaikan, Subject :  insiatif, Frequency : 1
Verb : Melalui, Subject : , Frequency : 1
Verb : memberikan, Subject :  dukungan sehari-hari workshop sesi mentoring, Frequency : 1
Verb : bernama, Subject :  Stylecation, Frequency : 1
Verb : memudahkan, Subject :  Sevva sebuah platform, Frequency : 1
Verb : menyewa, Subject :  pengguna sewa, Frequency : 1
Verb : merubah, Subject :  Perusahaan, Frequency : 1
Verb : menjadi, Subject :  strategi, Frequency : 1
Verb : menyewa, Subject :  fokus sewa, Frequency : 1
Verb : diseleksi, Subject :  baju fashion lainnya, Frequency : 1
Verb : mengumpulkan, Subject :  Stylecation, Frequency : 1
Verb : terseleksi, Subject :  baju, Frequency : 1
Verb : berkualitas, Subject :  photo, Frequency : 1
Verb : inventorinya, Subject : , Frequency : 1
Verb : menambah, Subject :  inventori desainer-desainer butik-butik sewa baju Stylecation, Frequency : 1
Verb : awalnya, Subject :  Andalin, Frequency : 1
Verb : membantu, Subject :  layanan integrasi pintu fokus kepabeaan, Frequency : 1
Verb : menjalin, Subject :  program Ideabox Andalin, Frequency : 1
Verb : mitra, Subject :  kerjasama, Frequency : 1
Verb : mitra, Subject :  logistik, Frequency : 1
Verb : mempunyai, Subject : , Frequency : 1
Verb : mengembangkan, Subject :  Andalin, Frequency : 1
Verb : mencakup, Subject : , Frequency : 1
Verb : menyiapkan, Subject :  Selanjutnya rencana bisnis selanjutnya Andalin tengah, Frequency : 1
Verb : adalah, Subject :  Ayoslide, Frequency : 1
Verb : bergerak, Subject :  platform iklan marketing, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : melalui, Subject :  insentif konsumen, Frequency : 1
Verb : mengakusisi, Subject :  Ayoslide, Frequency : 1
Verb : terdaftar, Subject :  pelanggan organik, Frequency : 1
Verb : menjalin, Subject :  Ayoslide, Frequency : 1
Verb : membantu, Subject :  ìUkuran batch, Frequency : 1
Verb : startup, Subject :  fokus kebutuhan individu, Frequency : 1
Verb : bekerja, Subject : , Frequency : 1
Verb : bekerja, Subject : , Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : membawa, Subject :  hari hari graduasi, Frequency : 1
Verb : berkesempatan, Subject :  GOTB startup, Frequency : 1
Verb : mengunjungi, Subject : , Frequency : 1
Verb : menginspirasi, Subject :  perusahaan teknologi, Frequency : 1
Verb : bertujuan, Subject :  Jakarta Blibli.com Baca Berita Indonesia BaBe Lazada ANGIN, Frequency : 1
Verb : mengembangkan, Subject : , Frequency : 1
Verb : belajar, Subject :  jaringan, Frequency : 1
Verb : menjalin, Subject :  perusahaan-perusahaan kesempatan, Frequency : 1
Verb : meluncurkan, Subject :  LINE, Frequency : 1
Verb : chat, Subject :  LINE SQUARE sebuah fitur, Frequency : 1
Verb : memungkinkan, Subject :  LINE SQUARE, Frequency : 1
Verb : menjaga, Subject :  pengguna minat terhubung, Frequency : 1
Verb : bergabung, Subject :  Pengguna, Frequency : 1
Verb : mengungkapkan, Subject :  percakapan, Frequency : 1
Verb : dahuluómembuat, Subject :  identitas, Frequency : 1
Verb : mengekspresikan, Subject : , Frequency : 1
Verb : mengenai, Subject :  pemikiran pendapat, Frequency : 1
Verb : merupakan, Subject :  ìLINE SQUARE, Frequency : 1
Verb : merepresentasikan, Subject :  layanan, Frequency : 1
Verb : mendekatkan, Subject :  Fitur, Frequency : 1
Verb : terlibat, Subject :  pengguna berdasarkan†minat, Frequency : 1
Verb : mendalam,î, Subject :  percakapan, Frequency : 1
Verb : berkembang, Subject :  ujar†Seokho Product Manager LINE SQUARE ìLINE, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : bertemu, Subject :  platform pengguna, Frequency : 1
Verb : memiliki, Subject :  pengguna, Frequency : 1
Verb : mencari, Subject :  minat, Frequency : 1
Verb : kata, Subject : , Frequency : 1
Verb : memungkinkan, Subject :  kunci LINE SQUARE, Frequency : 1
Verb : bergabung, Subject :  pengguna, Frequency : 1
Verb : menggunakan, Subject :  dalam†chatroom†dengan, Frequency : 1
Verb : mendorong, Subject :  nama panggilan, Frequency : 1
Verb : muncul, Subject :  Logo LINE SQUARE, Frequency : 1
Verb : melakukan†update†aplikasi, Subject :  list†atau†timeline†setelah pengguna LINE Indonesia Korea, Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : membuat, Subject :  LINE SQUARE pengguna, Frequency : 1
Verb : bergabung, Subject : , Frequency : 1
Verb : dinamakan, Subject :  komunitas, Frequency : 1
Verb : terdiri, Subject :  ìSquareî, Frequency : 1
Verb : membatasi, Subject :  topik Square, Frequency : 1
Verb : ingin, Subject :  jumlah pengguna, Frequency : 1
Verb : bergabung, Subject : , Frequency : 1
Verb : membagikan, Subject :  pengguna, Frequency : 1
Verb : memilih, Subject :  informasi LINE ID, Frequency : 1
Verb : mengundang, Subject :  Pengguna, Frequency : 1
Verb : bergabung, Subject :  pengguna, Frequency : 1
Verb : menggunakan, Subject :  Square, Frequency : 1
Verb : menampung, Subject : , Frequency : 1
Verb : bergabung, Subject :  Selain pengguna, Frequency : 1
Verb : inginkan, Subject : , Frequency : 1
Verb : menerapkan, Subject :  LINE, Frequency : 1
Verb : memastikan, Subject :  langkah pengamanan penanggulangan, Frequency : 1
Verb : melaporkan, Subject :  Contohnya pengguna, Frequency : 1
Verb : berbentuk, Subject :  konten, Frequency : 1
Verb : memiliki, Subject :  Selain LINE SQUARE, Frequency : 1
Verb : melaporkan, Subject :  sistem monitoring kata-kata, Frequency : 1
Verb : mengunggah, Subject :  pengguna, Frequency : 1
Verb : berencana, Subject :  LINE, Frequency : 1
Verb : menghadirkan, Subject : , Frequency : 1
Verb : termasuk, Subject :  LINE SQUARE negara Asia Tenggara lainnya, Frequency : 1
Verb : harus†memperbarui, Subject :  Untuk†menggunakan LINE SQUARE pengguna, Frequency : 1
Verb : membuat, Subject :  aplikasi LINE versi 7.6.0 versi atasnya kemudian†membuka aplikasi LINE buka†Daftar Grup daftar kontak klik tulisan logo LINE SQUARE bagian kanan pada†tab†Timeline, Frequency : 1
Verb : menunjukkan, Subject :  LINE SQUARE klik tombol ë+í bagian kanan atas,†ëMy, Frequency : 1
Verb : bergabung, Subject :  grup tempat pengguna, Frequency : 1
Verb : menunjukkan, Subject :  kategori bagian tengah, Frequency : 1
Verb : berdasarkan, Subject :  peringkat pengguna LINE SQUARE, Frequency : 1
Verb : menerima, Subject :  pertemuan 3rd†High Level Economy Dialogue HLED Pemerintah RI Pemerintah RRT Beijing Delegasi RI, Frequency : 1
Verb : terbatas, Subject :  kunjungan pertemuan CEO Alibaba Jack Ma, Frequency : 1
Verb : merupakan, Subject :  Jack Ma, Frequency : 1
Verb : lanjut, Subject : , Frequency : 1
Verb : terkait, Subject :  pertemuan Presiden RI Jack Ma Hangzhou September, Frequency : 1
Verb : mendampingi, Subject :  usulan penunjukan Jack Ma anggota advisory steering committee Roadmap E-commerce Indonesia Menteri Kominfo Dubes RI, Frequency : 1
Verb : bertemu, Subject :  Menko Perekonomian, Frequency : 1
Verb : ditemani, Subject :  Jack Ma, Frequency : 1
Verb : menyampaikan, Subject :  pertemuan Menteri Kominfo Rudiantara, Frequency : 1
Verb : menindaklanjuti, Subject :  penjelasan ìPertemuan Jack Ma, Frequency : 1
Verb : dikeluarkannya, Subject : , Frequency : 1
Verb : menyampaikan, Subject :  saat, Frequency : 1
Verb : menjadi, Subject :  undangan Jack Ma, Frequency : 1
Verb : menjalankan, Subject :  penasehat/advisor Steering Committee, Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : memberikan, Subject :  Rudiantara Jack Ma, Frequency : 1
Verb : datang, Subject :  jawaban, Frequency : 1
Verb : mengembangkan, Subject :  Indonesia perusahaan Tiongkok, Frequency : 1
Verb : berkembang, Subject :  ekosistem UMKM masyarakat suburban & pedesaan dunia, Frequency : 1
Verb : mendapat, Subject : , Frequency : 1
Verb : tambah, Subject : , Frequency : 1
Verb : memanfaatkan, Subject :  ekonomi, Frequency : 1
Verb : membeberkan, Subject : , Frequency : 1
Verb : membahas, Subject :  ìpertemuan Jack Ma, Frequency : 1
Verb : memberikan, Subject :  infrastruktur TIK, Frequency : 1
Verb : memberikan, Subject :  infrastruktur TIK, Frequency : 1
Verb : dibanding, Subject :  manfaat masyarakat pedesaan UMKM, Frequency : 1
Verb : memiliki, Subject :  masyarakat perkotaan masyarakat perkotaan, Frequency : 1
Verb : dijadikan, Subject :  infrastruktur TIK, Frequency : 1
Verb : menambahkan, Subject :  pembangunan-pembangunan infrastruktur TIK Rudiantara, Frequency : 1
Verb : melakukan, Subject :  ìIndonesia, Frequency : 1
Verb : menjadi, Subject :  transformasi sistem logistk pergerakan barang, Frequency : 1
Verb : menjadi, Subject :  sistem pembayaran payment system, Frequency : 1
Verb : memberdayakan, Subject :  FinTech, Frequency : 1
Verb : mendapatkan, Subject :  institusi keuangan teknologi masyarakat, Frequency : 1
Verb : membuat, Subject :  akses layanan keuangan sejalan strategi keuangan inklusi Pemerintah RI Indonesia, Frequency : 1
Verb : memanfaatkan, Subject :  terobosan, Frequency : 1
Verb : memiliki, Subject :  kanal orang Indonesia, Frequency : 1
Verb : mengumumkan, Subject :  PT Synnex Metrodata Indonesia SMI entitas anak PT Metrodata Electronic Tbk fokus dibidang Distribusi Teknologi Informasi Komunikasi, Frequency : 1
Verb : dikenal, Subject :  kemitraannya PT Sebelas Indonesia, Frequency : 1
Verb : membangun, Subject :  Insight Eight Eleven i-811)óperusahaan lokal Indonesia fokus, Frequency : 1
Verb : mengembangkan, Subject : , Frequency : 1
Verb : memasarkan, Subject :  enterprise software Data Analytics Solution, Frequency : 1
Verb : mengembangkan, Subject : , Frequency : 1
Verb : diberi, Subject :  solusi, Frequency : 1
Verb : memasarkan, Subject :  Sebagai†Distributor SMI, Frequency : 1
Verb : mitra, Subject :  solusi†Paques Super Query†dan†Paques†bagi, Frequency : 1
Verb : adalah, Subject :  Keistimewaan solusi Paques, Frequency : 1
Verb : dilengkapi, Subject : , Frequency : 1
Verb : mengolah, Subject :  visualisasi teks analitik, Frequency : 1
Verb : diterapkan, Subject :  Solusi Paques dipercaya, Frequency : 1
Verb : berjalan, Subject :  solusi, Frequency : 1
Verb : bekerjasama, Subject : , Frequency : 1
Verb : memilih, Subject :  saat perusahaan, Frequency : 1
Verb : mendapatkan, Subject :  data dianalisa data perusahaan, Frequency : 1
Verb : berdampak, Subject :  pengertian bisnis, Frequency : 1
Verb : meningkat, Subject :  produktifitas, Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : menghasilkan, Subject :  data mendapatkan†insight†yang, Frequency : 1
Verb : mengambil, Subject :  informasi perusahaan, Frequency : 1
Verb : menawarkan, Subject :  perusahaan Distribusi TIK Indonesia SMI, Frequency : 1
Verb : adalah, Subject :  Paques Data Processing Analytic Tools, Frequency : 1
Verb : merupakan, Subject :  piranti Data Enterprise, Frequency : 1
Verb : mulai, Subject :  engine platform, Frequency : 1
Verb : dilengkapi, Subject :  integrasi sumber data pengolahan analisa engine platform, Frequency : 1
Verb : didukung, Subject :  NLP Natural Language Processing, Frequency : 1
Verb : merupakan, Subject :  Paques Super Query, Frequency : 1
Verb : merupakan, Subject :  appliance Paques Data, Frequency : 1
Verb : adalah, Subject :  Kelebihan solusi Paques, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : melalui, Subject :  kemampuan self, Frequency : 1
Verb : diciptakan, Subject :  interpreter, Frequency : 1
Verb : disiapkan, Subject : , Frequency : 1
Verb : dikenal, Subject :  Paques, Frequency : 1
Verb : diciptakan, Subject :  Parallel Query Language grammar, Frequency : 1
Verb : dijadikan, Subject :  ìSaat peluang pasar piranti TI Indonesia pasar dBase DWH BI, Frequency : 1
Verb : dipahami, Subject :  target pasar, Frequency : 1
Verb : menerima, Subject : , Frequency : 1
Verb : mengenai, Subject : , Frequency : 1
Verb : dipercaya, Subject : , Frequency : 1
Verb : berkolaborasi, Subject :  Distributor Paques Data Processing Analytic Tools Paques Super Query Indonesia, Frequency : 1
Verb : mendukung, Subject :  ìHPE Superdome, Frequency : 1
Verb : membutuhkan, Subject :  kinerja Paques, Frequency : 1
Verb : memiliki, Subject :  kebutuhan komputasi HPE Superdome, Frequency : 1
Verb : dibanding, Subject :  socket processor slot memory, Frequency : 1
Verb : adalah, Subject :  Kelebihan mesin, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : digunakan, Subject :  kecepatan interconnect antar blade HPE Superdome, Frequency : 1
Verb : mitra, Subject : , Frequency : 1
Verb : diperoleh, Subject :  bisnis manfaat, Frequency : 1
Verb : memperkaya, Subject :  SMI, Frequency : 1
Verb : ditawarkan, Subject :  portofolio solusi, Frequency : 1
Verb : termasuk, Subject : , Frequency : 1
Verb : membuka, Subject : , Frequency : 1
Verb : seluas-luasnya, Subject :  kesempatan bisnis, Frequency : 1
Verb : diinginkan, Subject : , Frequency : 1
Verb : meningkatkan, Subject :  SMI, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : didukung, Subject :  pusat distribusi tersebar wilayah Indonesia, Frequency : 1
Verb : termasuk, Subject :  tenaga penjualan logistik, Frequency : 1
Verb : memberikan, Subject :  tim Technical Advisor Professional Engineers, Frequency : 1
Verb : mitra, Subject :  solusi, Frequency : 1
Verb : memastikan, Subject :  SMI, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : berbasiskan, Subject : , Frequency : 1
Verb : nya, Subject :  search engine data base back, Frequency : 1
Verb : menyisir, Subject :  ìsearch engine Paques, Frequency : 1
Verb : mendapat, Subject :  data on-the-fly, Frequency : 1
Verb : ditentukan, Subject :  perintah query definisinya, Frequency : 1
Verb : ìMelalui, Subject : , Frequency : 1
Verb : memudahkan, Subject :  Parallel Query Language, Frequency : 1
Verb : menjadikan, Subject :  query data scientist data analyst, Frequency : 1
Verb : memberikan, Subject :  Paques Data, Frequency : 1
Verb : lanjut, Subject : , Frequency : 1
Verb : terkait, Subject :  saat dilakukan†pengkajian mendalam, Frequency : 1
Verb : dikenakan, Subject :  model cara transaksi, Frequency : 1
Verb : mengenakan, Subject :  pajak namun†Kementerian Keuangan, Frequency : 1
Verb : disampaikan, Subject : , Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : terdeteksi, Subject :  Sri Mulyani,†transaksi perdagangan, Frequency : 1
Verb : dibandingkan, Subject : , Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : dilakukan, Subject :  transaksi, Frequency : 1
Verb : dilacak, Subject :  transaksi, Frequency : 1
Verb : pemiliknya, Subject :  †ìKalau negara Indonesia, Frequency : 1
Verb : jualnya, Subject : , Frequency : 1
Verb : pajaknya, Subject : , Frequency : 1
Verb : kata, Subject : , Frequency : 1
Verb : menurutnya, Subject : , Frequency : 1
Verb : menjawab, Subject :  Sri Mulyani pihaknya, Frequency : 1
Verb : mendapatkan, Subject :  Senada Sri Mulynai,†Ketua Tim Reformasi Perpajakan Kementerian Keuangan Suryo Utomo waktu pihaknya, Frequency : 1
Verb : katanya, Subject : , Frequency : 1
Verb : didefinisikan, Subject :  waktu model transaksi, Frequency : 1
Verb : dilakukan, Subject :  pungutan pajak, Frequency : 1
Verb : merupakan, Subject :  Pajak e-commerce online marketplace, Frequency : 1
Verb : dikenakan, Subject :  model bisnis, Frequency : 1
Verb : melengkapi, Subject :  Terbitnya Paket Kebijakan Ekonomi Jilid XIV pemerintah, Frequency : 1
Verb : mengakomodasi, Subject : , Frequency : 1
Verb : menjadi, Subject :  kebutuhan pelaku bisnis e-commerce start OnlinePajak, Frequency : 1
Verb : menyediakan, Subject :  aplikasi pajak, Frequency : 1
Verb : menegaskan, Subject :  Direktur Jenderal Pajak Surat Edaran Nomor SE/62/PJ/2013 Penegasan Ketentuan Perpajakan Transaksi e-Commerce, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : Berdasarkan, Subject : , Frequency : 1
Verb : adalah, Subject :  Berikut, Frequency : 1
Verb : adalah, Subject :  Definisi online marketplace, Frequency : 1
Verb : menyediakan, Subject : , Frequency : 1
Verb : berupa, Subject :  tempat kegiatan usaha, Frequency : 1
Verb : menjual, Subject :  toko internet mal internet tempat online marketplace merchant, Frequency : 1
Verb : adalah, Subject :  bawah, Frequency : 1
Verb : terdapat, Subject :  ecommerce, Frequency : 1
Verb : berdasarkan, Subject :  model bisnis online marketplace, Frequency : 1
Verb : membantah, Subject :  PT†Telekomunikasi†Indonesia Persero Tbk, Frequency : 1
Verb : mengenai, Subject :  informasi, Frequency : 1
Verb : membeli, Subject :  rencana, Frequency : 1
Verb : Menurut, Subject :  perusahaan penyedia menara PT Solusi Tunas Pratama Tbk, Frequency : 1
Verb : ada, Subject :  Direktur†Digital Strategic Portfolio Telkom David Bangun,†pihaknya saat, Frequency : 1
Verb : membeli, Subject :  rencana, Frequency : 1
Verb : ada, Subject :  ìîSaat, Frequency : 1
Verb : katanya, Subject :  rencana, Frequency : 1
Verb : tetap†menganggap, Subject :  Ditambahkannya BUMN telekomunikasi, Frequency : 1
Verb : katanya, Subject : , Frequency : 1
Verb : menggarap, Subject :  Telkom akan†serius, Frequency : 1
Verb : menara†telekomunikasi†melalui, Subject : , Frequency : 1
Verb : ujarnya, Subject :  anak usahanya PT Dayamitra†Telekomunikasi†(Mitratel Mitratel perusahaan menara Indonesia ìKalau valuasi, Frequency : 1
Verb : menyiapkan, Subject :  itu,†Telkom tengah, Frequency : 1
Verb : melalui, Subject :  inisiatif pengembangan bisnis, Frequency : 1
Verb : mengevaluasi, Subject :  jalur anorganik ìîSaat tengah, Frequency : 1
Verb : ada, Subject :  insiatif Prosesnya inisiatif, Frequency : 1
Verb : menggunakan, Subject :  final †Ekspansi anorganik nantinya, Frequency : 1
Verb : menyasar, Subject :  skema merger & acquisition M&A, Frequency : 1
Verb : ada, Subject :  bidang perusahaan Saat proses, Frequency : 1
Verb : termasuk, Subject :  perusahaan, Frequency : 1
Verb : bergerak, Subject :  Perusahaan-perusahaan, Frequency : 1
Verb : belanja, Subject :  Lazada destinasi, Frequency : 1
Verb : mengadakan, Subject :  online Indonesia Asia Tenggara, Frequency : 1
Verb : bertajuk, Subject :  ajang, Frequency : 1
Verb : mencari, Subject :  # DapurLazada sebuah kegiatan kompetisi, Frequency : 1
Verb : ingin, Subject :  koki rumahan, Frequency : 1
Verb : menunjukkan, Subject : , Frequency : 1
Verb : menciptakan, Subject :  kepiawaian, Frequency : 1
Verb : dimulai, Subject :  Periode pengumpulan resep recipe submission, Frequency : 1
Verb : diadakan, Subject :  Kegiatan, Frequency : 1
Verb : menghimpun, Subject :  halnya tahun Lazada, Frequency : 1
Verb : melalui, Subject :  macam resep koki rumahan Indonesia, Frequency : 1
Verb : Berdasarkan, Subject : , Frequency : 1
Verb : masuk, Subject :  total resep, Frequency : 1
Verb : memilih, Subject :  tim kurator resep Lazada, Frequency : 1
Verb : dipertandingkan, Subject :  peserta finalis resep masakan termenarik, Frequency : 1
Verb : memperebutkan, Subject :  finalis # DapurLazada, Frequency : 1
Verb : berupa, Subject :  hadiah, Frequency : 1
Verb : makan, Subject :  paket jalan-jalan Singapura, Frequency : 1
Verb : berbintang, Subject :  malam mewah restoran, Frequency : 1
Verb : menyampaikan, Subject :  Duri Granziol Co CEO Lazada Indonesia, Frequency : 1
Verb : ìKami, Subject : , Frequency : 1
Verb : melihat, Subject : , Frequency : 1
Verb : berbakat, Subject :  Indonesia koki rumahan, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : mengembangkan, Subject :  potensi, Frequency : 1
Verb : menjadi, Subject :  hobi, Frequency : 1
Verb : menghasilkan, Subject :  sesuatu, Frequency : 1
Verb : melihat, Subject : , Frequency : 1
Verb : mengunggah, Subject :  antusiasme peserta kompetisi # DapurLazada, Frequency : 1
Verb : mengikuti, Subject :  resep-resep andalannya media, Frequency : 1
Verb : sampai, Subject :  kompetisi, Frequency : 1
Verb : Merupakan, Subject : , Frequency : 1
Verb : memfasilitasi, Subject :  tujuan, Frequency : 1
Verb : menyalurkan, Subject :  konsumen, Frequency : 1
Verb : hobinya, Subject : , Frequency : 1
Verb : mendapatkan, Subject : , Frequency : 1
Verb : terdiri, Subject :  Anggota dewan juri tahun, Frequency : 1
Verb : menentukan, Subject :  Dewan juri, Frequency : 1
Verb : berdasarkan, Subject : , Frequency : 1
Verb : digunakan, Subject :  eksekusi teknik formulasi resep bahan, Frequency : 1
Verb : menjelaskan, Subject :  presentasi hidangan gaya kreatifitas rasa kecakapan, Frequency : 1
Verb : melihat, Subject :  ìSeru, Frequency : 1
Verb : bersungguh-sungguh, Subject :  peserta, Frequency : 1
Verb : menunjukkan, Subject : , Frequency : 1
Verb : menciptakan, Subject :  kebolehan, Frequency : 1
Verb : ungkap, Subject :  kreasi kuliner, Frequency : 1
Verb : berharap, Subject : , Frequency : 1
Verb : diadakan, Subject :  program, Frequency : 1
Verb : memberi, Subject :  tahun, Frequency : 1
Verb : berbakat, Subject :  kesempatan koki rumahan, Frequency : 1
Verb : unjuk, Subject :  Indonesia, Frequency : 1
Verb : memulai, Subject :  kebolehan, Frequency : 1
Verb : menambahkan, Subject : , Frequency : 1
Verb : ìKami, Subject : , Frequency : 1
Verb : terima, Subject : , Frequency : 1
Verb : mendukung, Subject :  kasih partner Lazada, Frequency : 1
Verb : terselenggaranya, Subject : , Frequency : 1
Verb : merupakan, Subject : , Frequency : 1
Verb : menjadi, Subject :  komitmen Lazada, Frequency : 1
Verb : konsumennya, Subject :  platform penghubung partner, Frequency : 1
Verb : memberikan, Subject :  Hal sejalan kampanye Dapur Lazada, Frequency : 1
Verb : mulai, Subject :  penawaran diskon rangkaian produk home kitchen appliances, Frequency : 1
Verb : menjadi, Subject :  Selain fasilitas ongkir, Frequency : 1
Verb : diharapkan, Subject :  pelanggan Lazada Indonesia, Frequency : 1
Verb : mempermudah, Subject : , Frequency : 1
Verb : mendapatkan, Subject :  konsumen, Frequency : 1
Verb : diperlukan, Subject :  alat, Frequency : 1
Verb : menciptakan, Subject : , Frequency : 1
Verb : memeriahkan, Subject :  rangka, Frequency : 1
Verb : menghadirkan, Subject :  perayaan hari kemerdekaan Republik Indonesia bulan Agustus Agustus Lazada, Frequency : 1
Verb : menghadirkan, Subject :  penawaran bundle diskon peralatan perlengkapan dapur diskon exclusive item Maxim diskon Sharp Sanken penawaran Cosmos Selain Lazada, Frequency : 1
Verb : mulai, Subject :  ëKampanye Merdeka Ongkirí produk kategori, Frequency : 1
Verb : mendorongnya, Subject :  Alibaba, Frequency : 1
Verb : membeli, Subject :  Asia Tenggara, Frequency : 1
Verb : menguasai, Subject : , Frequency : 1
Verb : berbasis, Subject :  Tokopedia sebuah perusahaan e-commerce, Frequency : 1
Verb : menjadi, Subject :  Indonesia †Alibaba, Frequency : 1
Verb : menanamkan, Subject :  pemegang saham, Frequency : 1
Verb : didirikan, Subject :  Tokopedia, Frequency : 1
Verb : mengoperasikan, Subject :  tahun, Frequency : 1
Verb : memungkinkan, Subject :  pasar, Frequency : 1
Verb : menengah, Subject :  perusahaan, Frequency : 1
Verb : membeli, Subject : , Frequency : 1
Verb : mengumpulkan, Subject :  Perusahaan, Frequency : 1
Verb : menghitung, Subject :  dolar SoftBank Sequoia tahun, Frequency : 1
Verb : diposting, Subject :  Mitra EastVentures CyberAgent Beenos pendukung awalnya Catatan, Frequency : 1
Verb : meningkatkan, Subject :  ìKemitraan Alibaba, Frequency : 1
Verb : pelanggannya, Subject :  skala kualitas persembahan Tokopedia, Frequency : 1
Verb : mempermudah, Subject : , Frequency : 1
Verb : mitra, Subject :  pedagang, Frequency : 1
Verb : melakukan, Subject : , Frequency : 1
Verb : menganggap, Subject : , Frequency : 1
Verb : kata, Subject :  Alibaba guru teladan, Frequency : 1
Verb : menyambut, Subject :  ìHari, Frequency : 1
Verb : mempercepat, Subject :  pemegang saham kemitraan, Frequency : 1
Verb : mendemokratiskan, Subject :  misi Tokopedia, Frequency : 1
Verb : melalui, Subject : , Frequency : 1
Verb : Ada, Subject : , Frequency : 1
Verb : ditulis, Subject :  saham Asia Tenggara Sebuah laporan baru-baru, Frequency : 1
Verb : memperkirakan, Subject :  Google, Frequency : 1
Verb : melonjak, Subject :  e-commerce tahun kawasan, Frequency : 1
Verb : menjadi, Subject :  dolar tahun, Frequency : 1
Verb : Diperkirakan, Subject : , Frequency : 1
Verb : adalah, Subject : , Frequency : 1
Verb : dikaitkan, Subject :  Tokopedia, Frequency : 1
Verb : menyatakan, Subject :  Sebuah sumber, Frequency : 1
Verb : mengadakan, Subject :  Tokopedia, Frequency : 1
Verb : didukung, Subject :  pembicaraan Alibaba JD.com sebuah perusahaan saingan, Frequency : 1
Verb : mengumumkan, Subject : , Frequency : 1
Verb : termasuk, Subject :  kuartal bisnis blockbuster lainnya hari, Frequency : 1
Verb : berbasis, Subject :  Kredit perusahaan Lazada pasar, Frequency : 1
Verb : menginvestasikan, Subject :  Asia Tenggara, Frequency : 1
Verb : meningkatkan, Subject :  dolar, Frequency : 1
Verb : menjadi, Subject :  pendapatan perdagangan persen, Frequency : 1
Verb : menegaskan, Subject :  miliar RMB dolar AS total CNY dolar AS Alibaba bullish Asia Tenggara investasi Tokopedia, Frequency : 1
Verb : menandai, Subject :  Kesepakatan, Frequency : 1
Verb : membuat, Subject :  investasi sebuah startup Indonesia bulan, Frequency : 1
Verb : menghargai, Subject :  dolar platform pemesanan Traveloka sebuah kesepakatan, Frequency : 1
Verb : menyetujui, Subject :  tahun Go-Jek, Frequency : 1
Verb : dipimpin, Subject :  putaran dolar, Frequency : 1
Verb : disebut-sebut, Subject :  Pertumbuhan Indonesia, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : masuk, Subject :  produk, Frequency : 1
Verb : mulai, Subject :  produk-produk merek Indonesia, Frequency : 1
Verb : mengokohkan, Subject : , Frequency : 1
Verb : menembus, Subject :  posisinya pasar berpotensi, Frequency : 1
Verb : menyampaikan, Subject :  Florian Holm Co-CEO Lazada Indonesia, Frequency : 1
Verb : belanja, Subject :  Lazada destinasi, Frequency : 1
Verb : membuka, Subject :  online nomor Indonesia Asia Tenggara, Frequency : 1
Verb : memasarkan, Subject :  kesempatan seluas-luasnya pemilik merek, Frequency : 1
Verb : hasilkan, Subject :  produk-produk, Frequency : 1
Verb : miliki, Subject :  ìDengan jaringan penjualan, Frequency : 1
Verb : mendukung, Subject :  optimis, Frequency : 1
Verb : mengembangkan, Subject :  pemilik merek Indonesia, Frequency : 1
Verb : merangkul, Subject :  usahanya online, Frequency : 1
Verb : dijalankannya, Subject : , Frequency : 1
Verb : ongkir, Subject :  program, Frequency : 1
Verb : berharap, Subject :  Indonesia Lazada, Frequency : 1
Verb : tersedia, Subject :  Saat Lazada Indonesia, Frequency : 1
Verb : diproduksi, Subject :  produk-produk merek Indonesia kategori, Frequency : 1
Verb : mendapatkan, Subject :  daerah Indonesia busana muslim sepatu sandal furniture asesoris perempuan kopi produk menonjol, Frequency : 1
Verb : adalah, Subject :  sambutan hangat konsumen, Frequency : 1
Verb : diproduksi, Subject :  furniture perlengkapan rumah tangga merek Oscar Living, Frequency : 1
Verb : diproduksi, Subject :  produk lainnya sepatu sandal merek Marlee, Frequency : 1
Verb : asesoris, Subject :  Bogor Jawa Barat https://shop lazada.co.id/ID11627.htm, Frequency : 1
Verb : dibuat, Subject :  perempuan merek Vona, Frequency : 1
Verb : diproduksi, Subject :  perempuan-perempuan Bali Pulau Bali http://www lazada.co.id/vona-indonesia-sis Kopi idikalang, Frequency : 1
Verb : mengungkapkan, Subject :  Muhammad Gemal Pradika Laksono seller Lazada Bandung, Frequency : 1
Verb : besarnya, Subject : , Frequency : 1
Verb : melalui, Subject :  kesempatan mengembangakn usaha, Frequency : 1
Verb : berdagang, Subject :  ìMengubah pola pikir, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : alami, Subject : , Frequency : 1
Verb : kurun, Subject : , Frequency : 1
Verb : menjual, Subject :  waktu tahun bulan, Frequency : 1
Verb : adalah, Subject :  Kunci keberhasilan, Frequency : 1
Verb : berdagang, Subject :  kejujuran, Frequency : 1
Verb : menjaga, Subject : , Frequency : 1
Verb : tanggap, Subject :  mutu produk, Frequency : 1
Verb : memberikan, Subject : , Frequency : 1
Verb : ungkap, Subject :  pelayanan, Frequency : 1
Verb : mari, Subject :  ìDengan semangat kemerdekaan Agustus, Frequency : 1
Verb : bangkitkan, Subject : , Frequency : 1
Verb : menggunakan, Subject : , Frequency : 1
Verb : dukung, Subject :  produk merek lokal Indonesia, Frequency : 1
Verb : turut, Subject :  Lazada pemimpin pasar industri†e-commerce†Indonesia berinovasi berkomitmen, Frequency : 1
Verb : memajukan, Subject : , Frequency : 1
Verb : menjadi, Subject :  produk-produk merek, Frequency : 1
Verb : merambah, Subject :  tuan rumah negara, Frequency : 1
Verb : global†melalui, Subject :  pasar dan†go, Frequency : 1
Verb : menandatangani, Subject :  Presiden Republik Indonesia Joko Widodo, Frequency : 1
Verb : Berbasis, Subject :  Peraturan Presiden Perpres Nomor Tahun Peta Jalan Sistem Perdagangan, Frequency : 1
Verb : berusaha, Subject :  aturan pemerintah, Frequency : 1
Verb : membuat, Subject : , Frequency : 1
Verb : jual, Subject :  landasan pengembangan bisnis, Frequency : 1
Verb : mendatang, Subject :  tanah air tahun, Frequency : 1
Verb : begitu, Subject : , Frequency : 1
Verb : menyisakan, Subject :  aturan dinilai†Asosiasi E-Commerce Indonesia idEA, Frequency : 1
Verb : diungkap, Subject : , Frequency : 1
Verb : menyisakan, Subject :  Ketua Bidang Pajak Infrastruktur Cyber Security idEA Bima Laga †Perpres, Frequency : 1
Verb : menghadirkan, Subject :  masalah soal pengenaan pajak, Frequency : 1
Verb : didengungkan, Subject :  Isu Pajak Cuma-Cuma, Frequency : 1
Verb : adalah, Subject :  posisi idEA, Frequency : 1
Verb : menolak, Subject : , Frequency : 1
Verb : melakukan, Subject :  aturan, Frequency : 1
Verb : mengacu, Subject :  ìSejauh pemerintah, Frequency : 1
Verb : menyatakan, Subject :  Surat Edaran Nomor Tahun, Frequency : 1
Verb : diharuskan, Subject :  iklan baris misalnya, Frequency : 1
Verb : membayar, Subject : , Frequency : 1
Verb : ada, Subject :  Saat, Frequency : 1
Verb : dipungut, Subject :  anggota, Frequency : 1
Verb : menghadirkan, Subject :  pajak Direktorat Jenderal Pajak DJP, Frequency : 1
Verb : Menurutnya, Subject : , Frequency : 1
Verb : terjawab, Subject :  isu, Frequency : 1
Verb : digodok, Subject :  Rancangan Peraturan Pemerintah mengenai†e-commerce†yang saat tengah, Frequency : 1
Verb : berharap, Subject : , Frequency : 1
Verb : mengeluarkan, Subject :  Kementerian Keuangan, Frequency : 1
Verb : membatalkan, Subject :  peraturan, Frequency : 1
Verb : beroperasi, Subject :  ìDJP saat mengakomodir soal keharusan perusahaan teknologi, Frequency : 1
Verb : mengantongi, Subject :  Indonesia, Frequency : 1
Verb : dikenakan, Subject :  izin Badan Usaha BUT, Frequency : 1
Verb : masukkan, Subject : , Frequency : 1
Verb : dilanggar, Subject :  rancangan aturan Kementerian Perdagangan, Frequency : 1
Verb : berakibat, Subject : , Frequency : 1
Verb : memberi, Subject : , Frequency : 1
Verb : menjadi, Subject :  pinjaman fintech, Frequency : 1
Verb : berinvestasi, Subject : , Frequency : 1
Verb : diberikan, Subject :  benefit, Frequency : 1
Verb : meringankan, Subject :  perusahaan fintech, Frequency : 1
Verb : menolong, Subject :  keinginan pemerintah perusahaan fintech, Frequency : 1
Verb : berbasis, Subject :  Kehadiran perusahaan jasa keuangan, Frequency : 1
Verb : memberi, Subject :  teknologi technology/fintech, Frequency : 1
Verb : melakukan, Subject :  orang, Frequency : 1
Verb : mengajukan, Subject :  transaksi keuangan, Frequency : 1
Verb : melakukannya, Subject :  pinjaman dana bank fintech, Frequency : 1
Verb : memanfaatkan, Subject :  Penetapan bunga per bulan sangatlah mempengaruhi†decision†para calon peminjam, Frequency : 1
Verb : disiapkan, Subject :  fasilitas, Frequency : 1
Verb : menggunakan, Subject :  halnya Tunaiku pola peminjaman Rp2 ñ Rp tenor peminjaman ñ bulan Tunaiku, Frequency : 1
Verb : ditetapkan, Subject :  ìJumlah rupiah tenor peminjaman bunga, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : memilih, Subject :  alasan peminjam, Frequency : 1
Verb : menekankan, Subject :  Menyiasati pertumbuhan perusahaan fintech pemerintah, Frequency : 1
Verb : memegang, Subject :  perusahaan fintech, Frequency : 1
Verb : meminimalkan, Subject : , Frequency : 1
Verb : dilakukan, Subject :  resiko kredit, Frequency : 1
Verb : memberikan, Subject :  Tunaiku, Frequency : 1
Verb : mengembalikan, Subject :  fasilitas tambahan konsumen Tunaiku, Frequency : 1
Verb : melakukan, Subject :  konsumen, Frequency : 1
Verb : terlanjur, Subject :  pembayaran sisa kewajiban bunga bulan Selain konsumen, Frequency : 1
Verb : melakukan, Subject : , Frequency : 1
Verb : mengembalikan, Subject :  pembayaran penghitungan jumlah bunga Tunaiku, Frequency : 1
Verb : melakukan, Subject :  dana hari kedepan konsumen, Frequency : 1
Verb : keringanan, Subject : , Frequency : 1
Verb : membantu, Subject :  bunga, Frequency : 1
Verb : membutuhkan, Subject :  konsumen, Frequency : 1
Verb : mendapatkan, Subject :  ìSaya, Frequency : 1
Verb : dimudahkan, Subject :  pinjaman cara, Frequency : 1
Verb : diungkapkan, Subject :  perhitungan bunga flat memberatkan,î, Frequency : 1
Verb : terbantukan, Subject :  konsumen, Frequency : 1
Verb : meminjam, Subject : , Frequency : 1
Verb : membantu, Subject :  Rp15juta Tunaiku kebutuhan†urgent-nya, Frequency : 1
Verb : diharapkan, Subject :  Keberadaan perusahaan-perusahaan fintech, Frequency : 1
Verb : menjadi, Subject : , Frequency : 1
Verb : mempergunakan, Subject :  Kecepatan proses administrasi, Frequency : 1
Verb : sampai, Subject : , Frequency : 1
Verb : adalah, Subject :  penerapan aturan bunga per bulan, Frequency : 1
Verb : diberikan, Subject :  keuntungan, Frequency : 1
Verb : memenuhi, Subject :  Ketertarikan masyarakat, Frequency : 1
Verb : membuat, Subject :  kebutuhan keuangan, Frequency : 1
Verb : menjadi, Subject :  perkembangan teknologi, Frequency : 1
Verb : menjadi, Subject :  kebutuhan, Frequency : 1
Verb : disukai, Subject :  Fenomena bisnis fintech kelebihannya, Frequency : 1
Verb : ikut, Subject :  Tentunya regulasi, Frequency : 1
Verb : memegang, Subject : , Frequency : 1
Verb : berkembang, Subject :  peranan kondisi perekonomian, Frequency : 1
Verb : memberi, Subject :  Berbekal ide hadir, Frequency : 1
Verb : terdapat, Subject :  sadar Indonesia, Frequency : 1
Verb : memiliki, Subject : , Frequency : 1
Verb : memperkenalkan, Subject :  Bank Indonesia, Frequency : 1
Verb : pelajar, Subject :  layanan keuangan, Frequency : 1
Verb : pelajar, Subject : , Frequency : 1
Verb : mengikuti, Subject :  SMA SMK Kecamatan Cidaun Kabupaten Cianjur Jawa Barat Jabar, Frequency : 1
Verb : pelajar, Subject :  Disampaikan†Kepala Perwakilan BI Jabar Wiwiek Sisto Widayat, Frequency : 1
Verb : menyampaikan, Subject : , Frequency : 1
Verb : ingin, Subject : , Frequency : 1
Verb : dirasakan, Subject :  kehadiran, Frequency : 1
Verb : ingin, Subject :  daerah, Frequency : 1
Verb : kata, Subject :  masyarakat masyarakat bagian selatan Jawa Barat, Frequency : 1
Verb : disampaikan, Subject :  Ditambahkannya,†dalam kegiatan BI Mengajar materi, Frequency : 1
Verb : pelajar, Subject : , Frequency : 1
Verb : terlihat, Subject : , Frequency : 1
Verb : menjawab, Subject : , Frequency : 1
Verb : memberikan, Subject :  pertanyaan, Frequency : 1
Verb : mendapatkan, Subject : , Frequency : 1
Verb : catatkan, Subject :  Maskapai Garuda Indonesia, Frequency : 1
Verb : mencapai, Subject :  jumlah trafik kunjungan aplikasi channel website mobile apps pelaksanaan Garuda Indonesia Travel Fair GOTF fase, Frequency : 1
Verb : meningkat, Subject :  pengunjung, Frequency : 1
Verb : dibandingkan, Subject :  persen, Frequency : 1
Verb : mencatatkan, Subject :  Selain Garuda Indonesia, Frequency : 1
Verb : mencapai, Subject :  pertumbuhan††pengguna aplikasi GA Mobile Apps, Frequency : 1
Verb : pengunduh, Subject :  persen jumlah, Frequency : 1
Verb : membukukan, Subject :  peningkatan jumlah trafik pengguna aplikasi Garuda Indonesia, Frequency : 1
Verb : mencapai, Subject :  transaksi penjualan, Frequency : 1
Verb : dilaksanakan, Subject :  Rp milyar pelaksanaan GOTF 2017.fase, Frequency : 1
Verb : mengungkapkan, Subject :  Direktur Marketing & Teknologi Informasi Garuda Indonesia Nina Sulistyowati, Frequency : 1
Verb : terlepas, Subject :  peningkatan trafik pengguna platform pelaksanaan GOTF fase, Frequency : 1
Verb : meningkat, Subject :  upaya perusahaan meningkatkan†market platform penjualan lini Pencapaian transaksi penjualan GOTF fase, Frequency : 1
Verb : meningkat, Subject : , Frequency : 1
Verb : dibandingkan, Subject :  persen, Frequency : 1
Verb : dicapai, Subject :  total transaksi, Frequency : 1
Verb : dilaksanakan, Subject :  pelaksanaan GOTF Fase, Frequency : 1
Verb : menambahkan, Subject : , Frequency : 1
Verb : estimasikan, Subject :  ìPertumbuhan trafik kunjungan GOTF fase proyeksi target, Frequency : 1
Verb : meningkat, Subject :  tren transaksi, Frequency : 1
Verb : dilaksanakan, Subject :  kegiatan travel fair, Frequency : 1
Verb : meningkatkan, Subject :  perusahaan, Frequency : 1
Verb : mencatatkan, Subject :  pelaksanaan GOTF Fase Garuda Indonesia, Frequency : 1
Verb : mencapai, Subject :  Adapun pertumbuhan transaksi mobile apps mencapai††30,3††persen total transaksi, Frequency : 1
Verb : membukukan, Subject :  Garuda Indonesia, Frequency : 1
Verb : mencapai, Subject :  pendapatan transaksi penjualan rute sektor GOTF Fase, Frequency : 1
Verb : mencatatkan, Subject :  Adapun sektor Garuda Indonesia, Frequency : 1
Verb : mencatatkan, Subject :  rute, Frequency : 1
Verb : adalah, Subject :  penjualan GOTF fase diantaranya, Frequency : 1
Verb : adalah, Subject :  rute Jakarta Denpasar Jakarta Surabaya Jakarta Medan Jakarta ñ††Labuan Bajo Adapun sector, Frequency : 1
Verb : merupakan, Subject :  Pelaksanaan GOTF fase, Frequency : 1
Verb : terdiri, Subject :  hasil kolaborasi sinergi BUMN Garuda Indonesia Himpunan Bank Milik Negara HIMBARA)††yang, Frequency : 1
Verb : Melalui, Subject :  Bank Negara Indonesia BNI Bank Rakyat Indonesia BRI Bank Tabungan Negara BTN Bank Mandiri, Frequency : 1
Verb : menawarkan, Subject :  kolaborasi Garuda Indonesia, Frequency : 1
Verb : disinergikan, Subject :  program promo penjualan, Frequency : 1
Verb : dimiliki, Subject :  fitur layanan perbankan, Frequency : 1
Verb : milik, Subject :  bank, Frequency : 1
Verb : mengatakan, Subject :  Ketua Indonesian E-commerce Association idEA Aulia Ersyah Marinto, Frequency : 1
Verb : diperkirakan, Subject :  pasar e-Commerce Indonesia, Frequency : 1
Verb : mencapai, Subject : , Frequency : 1
Verb : dibandingkan, Subject :  ìTransaksi†e-Commerce†tumbuh tahun, Frequency : 1
Verb : katanya, Subject : , Frequency : 1
Verb : memastikan, Subject :  Aulia, Frequency : 1
Verb : ditopang, Subject :  persentase pertumbuhan ekonomi saat, Frequency : 1
Verb : mengagendakan, Subject :  sektor e-commerce, Frequency : 1
Verb : mengadakan, Subject : , Frequency : 1
Verb : termasuk, Subject :  survey stakeholders, Frequency : 1
Verb : mengenai, Subject :  BPS data, Frequency : 1
Verb : mengatakan, Subject :  Kepala Badan Pusat Statistik Suhariyanto, Frequency : 1
Verb : beli, Subject : , Frequency : 1
Verb : Menurutnya, Subject : , Frequency : 1
Verb : menjadi, Subject :  kontribusi konsumsi rumah tangga produk ìPertumbuhan ekonomi Indonesia triwulan tahun †Konsumsi Rumah Tangga, Frequency : 1
Verb : yakni, Subject :  sumber pertumbuhan ekonomi, Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : ada, Subject :  Kepala BPS, Frequency : 1
Verb : terjadi, Subject : , Frequency : 1
Verb : menuju, Subject :  perubahan perilaku konsumsi masyarakat barang-barang, Frequency : 1
Verb : termasuk, Subject :  komoditas, Frequency : 1
Verb : tumbuh, Subject :  ìKonsumsi rumah tangga, Frequency : 1
Verb : tumbuh, Subject : , Frequency : 1
Verb : dibandingkan, Subject :  triwulan, Frequency : 1
Verb : ada, Subject :  tahun, Frequency : 1
Verb : naik, Subject :  konsumsi leisure, Frequency : 1
Verb : menunjukkan, Subject : , Frequency : 1
Verb : mulai, Subject :  masyarakat, Frequency : 1
Verb : memikirkan, Subject : , Frequency : 1
Verb : menjelaskan, Subject :  Pengamat ekonomi Faisal Basri, Frequency : 1
Verb : ditentukan, Subject :  konsumsi, Frequency : 1
Verb : mengatakan, Subject :  pendapatan Faisal, Frequency : 1
Verb : naik, Subject :  ìProporsi tabungan total pendapatan, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : mengatakan, Subject :  penyimpanan uangî anggota Komite Ekonoi Indonesia KEIN Hendri Saparini, Frequency : 1
Verb : menurutnya, Subject :  pertumbuhan ekonomi Indonesia,meski demikain, Frequency : 1
Verb : mengambil, Subject :  pemerintah, Frequency : 1
Verb : terwujud, Subject :  langkah potensi ekonomi, Frequency : 1
Verb : ada, Subject :  ìPotensi prospek pertumbuhan ekonomi indonesia optimis, Frequency : 1
Verb : katanya, Subject :  urutan ekonomi, Frequency : 1
Verb : mencegah, Subject : , Frequency : 1
Verb : melakukan, Subject :  terjadinya penyelewengan korupsi keuangan daerah Kementerian Negeri Kemendagri, Frequency : 1
Verb : tunai, Subject :  sosialisasi transaksi keuangan, Frequency : 1
Verb : diikuti, Subject : , Frequency : 1
Verb : sekda, Subject :  pihak perbankan, Frequency : 1
Verb : non-tunai, Subject :  ìIni sosialisasi implementasi transaksi keuangan, Frequency : 1
Verb : dipakai, Subject :  Nantinya lewat sistem, Frequency : 1
Verb : ada, Subject :  perbankan, Frequency : 1
Verb : kata, Subject :  hubungan, Frequency : 1
Verb : Menurut, Subject : , Frequency : 1
Verb : tercatat, Subject :  Hadi sistem, Frequency : 1
Verb : menghindari, Subject :  kas daerah, Frequency : 1
Verb : menekan, Subject :  Tentunya, Frequency : 1
Verb : dikedepankan, Subject :  ìSemua komitmen integritas, Frequency : 1
Verb : ada, Subject : , Frequency : 1
Verb : kena, Subject : , Frequency : 1
Verb : ada, Subject :  OTT, Frequency : 1
Verb : kena, Subject : , Frequency : 1
Verb : ujarnya, Subject :  OTT Prilaku individu inilah, Frequency : 1
Verb : mengatakan, Subject :  sistem Hadi, Frequency : 1
Verb : ada, Subject :  dikelola pihak perbankan, Frequency : 1
Verb : dikirim, Subject :  dana pusat, Frequency : 1
Verb : tercatat, Subject :  perbankan, Frequency : 1
Verb : digunakan, Subject :  Selain sistem, Frequency : 1
Verb : diketahui, Subject :  online, Frequency : 1
Verb : cepat,î, Subject :  ìEvaluasi, Frequency : 1
Verb : menyayangkan, Subject : , Frequency : 1
Verb : tersimpan, Subject :  tingginya jumlah dana daerah, Frequency : 1
Verb : Tercatat, Subject :  bank, Frequency : 1
Verb : sampai, Subject : , Frequency : 1
Verb : tersimpan, Subject :  semester uang, Frequency : 1
Verb : tumbuh, Subject :  ìIni perekonomian daerah, Frequency : 1
Verb : tersimpan, Subject : , Frequency : 1
Verb : didorong, Subject :  bank tolonglah, Frequency : 1
Verb : meminta, Subject : , Frequency : 1
Verb : mendorong, Subject : , Frequency : 1
Verb : dipercepat, Subject :  pembahasan Perubahan APBD, Frequency : 1
Verb : digunakan, Subject :  Sisa Penggunaan Anggaran SiLPA sebelum perubahan APBD, Frequency : 1
Verb : ketentuannya, Subject :  ìYang dipercaya bank daerah, Frequency : 1

Process finished with exit code 0

```
## Refference and More Information
this project use library from IndonesiaNER project.
 
 For more information about the library see : [Yusuf Syaifudin IndonesiaNER project](https://github.com/yusufsyaifudin/indonesia-ner)
 
 For API documentation follow this [link](http://yusufsyaifudin.github.io/indonesia-ner/doc/api/)