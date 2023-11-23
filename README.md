# ObjectOrientedProgrammingAOL
<h3>
<b>Tema :</b> Kesehatan<br>
<b>Judul:</b> Apotek<br>
<b>Fitur:</b>
</h3>

- CRUD data Obat dan alat kesehatan
- Atur stock dari pemasukan barang (Update stock)
- Penjualan (Update stock)

<h3>Tabel pada Database:</h3>

- Obat dan Alat Kesehatan
    - Kode obat (PK)
    - Nama Obat
    - Stok
    - Jenis Obat
    - Harga
    - Keterangan Tambahan

- DetailTransaksi
    - Kode Transaksi (FK)
    - Kode Obat (FK)
    - Jumlah

- HeaderTransaksi
    - Kode Transaksi (PK)
    - Tanggal
    - Nama Client
    - Nama Staff