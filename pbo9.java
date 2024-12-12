class Kendaraan {
    private String merek;
    private int tahun;

    public Kendaraan(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    public String info() {
        return "Kendaraan: " + merek + ", Tahun: " + tahun;
    }
}

class Mobil extends Kendaraan {
    private String warna;

    public Mobil(String merek, int tahun, String warna) {
        super(merek, tahun);
        this.warna = warna;
    }

    @Override
    public String info() {
        return super.info() + ", warna: " + warna;
    }
}

class SepedaMotor extends Kendaraan {
    private String jenis;

    public SepedaMotor(String merek, int tahun, String jenis) {
        super(merek, tahun);
        this.jenis = jenis;
    }

    @Override
    public String info() {
        return super.info() + ", Jenis: " + jenis;
    }
}

class MobilBerat extends Kendaraan {
    private double kapasitas;

    public MobilBerat(String merek, int tahun, double kapasitas) {
        super(merek, tahun);
        this.kapasitas = kapasitas;
    }

    @Override
    public String info() {
        return super.info() + ", Kapasitas: " + kapasitas + " ton";
    }
}

class Truk extends MobilBerat {
    private String jenisTruk;

    public Truk(String merek, int tahun, double kapasitas, String jenisTruk) {
        super(merek, tahun, kapasitas);
        this.jenisTruk = jenisTruk;
    }

    @Override
    public String info() {
        return super.info() + ", Jenis Truk: " + jenisTruk;
    }
}

class Bus extends MobilBerat {
    private int jumlahKursi;

    public Bus(String merek, int tahun, double kapasitas, int jumlahKursi) {
        super(merek, tahun, kapasitas);
        this    .jumlahKursi = jumlahKursi;
    }

    @Override
    public String info() {
        return super.info() + ", Jumlah Kursi: " + jumlahKursi;
    }
}

public class pbo9 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Lamborghini Aventador", 2020, "pink" );
        Kendaraan sepedaMotor = new SepedaMotor("Vespa Matic", 2020, "Pink");
        Kendaraan truk = new Truk("Okezone Otomotif", 2018, 3, "Truk Box Pink");
        Kendaraan bus = new Bus("Mercedes", 2021, 20, 40);

        tampilkanInfo(mobil);
        tampilkanInfo(sepedaMotor);
        tampilkanInfo(truk);
        tampilkanInfo(bus);
    }

    public static void tampilkanInfo(Kendaraan kendaraan) {
        System.out.println(kendaraan.info());
    }
}