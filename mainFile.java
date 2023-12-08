import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ApotekGUI extends JFrame {

    private static final String JDBC_DRIVER = "-";
    private static final String DB_URL = "-";
    private static final String USER = "username";
    private static final String PASS = "password";

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    private JTextField namaObatField, stokField, jenisObatField, hargaField, keteranganField;
    private JTextArea resultArea;

    public ApotekGUI() {
        super("Apotek App");

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement
            stmt = conn.createStatement();

            // Create database and tables if not exists
            createDatabaseAndTables();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        setLayout(new BorderLayout());

        // Panel untuk input data obat/alat kesehatan
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));

        inputPanel.add(new JLabel("Nama Obat:"));
        namaObatField = new JTextField();
        inputPanel.add(namaObatField);

        inputPanel.add(new JLabel("Stok:"));
        stokField = new JTextField();
        inputPanel.add(stokField);

        inputPanel.add(new JLabel("Jenis Obat:"));
        jenisObatField = new JTextField();
        inputPanel.add(jenisObatField);

        inputPanel.add(new JLabel("Harga:"));
        hargaField = new JTextField();
        inputPanel.add(hargaField);

        inputPanel.add(new JLabel("Keterangan Tambahan:"));
        keteranganField = new JTextField();
        inputPanel.add(keteranganField);

        JButton tambahButton = new JButton("Tambah Data");
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahObatAlatKesehatan();
                lihatDaftarObatAlatKesehatan();
            }
        });

        inputPanel.add(new JLabel());
        inputPanel.add(tambahButton);

        // Panel untuk menampilkan hasil/query
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // Menambahkan panel ke frame
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    private void createDatabaseAndTables() throws SQLException {
       
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS apotek");
        stmt.executeUpdate("USE apotek");

        
        String createObatAlatKesehatanTableSQL = "CREATE TABLE IF NOT EXISTS ObatAlatKesehatan " +
                "(KodeObat INT AUTO_INCREMENT PRIMARY KEY, " +
                "NamaObat VARCHAR(255), " +
                "Stok INT, " +
                "JenisObat VARCHAR(255), " +
                "Harga DOUBLE, " +
                "KeteranganTambahan VARCHAR(255))";
        stmt.executeUpdate(createObatAlatKesehatanTableSQL);
    }

    private void tambahObatAlatKesehatan() {
        String namaObat = namaObatField.getText();
        int stok = Integer.parseInt(stokField.getText());
        String jenisObat = jenisObatField.getText();
        double harga = Double.parseDouble(hargaField.getText());
        String keteranganTambahan = keteranganField.getText();

        try {
            String insertObatAlatKesehatanSQL = "INSERT INTO ObatAlatKesehatan (NamaObat, Stok, JenisObat, Harga, KeteranganTambahan) " +
                    "VALUES ('" + namaObat + "', " + stok + ", '" + jenisObat + "', " + harga + ", '" + keteranganTambahan + "')";
            stmt.executeUpdate(insertObatAlatKesehatanSQL);

            resultArea.setText("Data berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Gagal menambahkan data.");
        }
    }

    private void lihatDaftarObatAlatKesehatan() {
        try {
            resultArea.setText("\n=== Daftar Obat dan Alat Kesehatan ===\n");

     
            rs = stmt.executeQuery("SELECT * FROM ObatAlatKesehatan");

            while (rs.next()) {
                resultArea.append("Kode Obat: " + rs.getInt("KodeObat") + "\n");
                resultArea.append("Nama Obat: " + rs.getString("NamaObat") + "\n");
                resultArea.append("Stok: " + rs.getInt("Stok") + "\n");
                resultArea.append("Jenis Obat: " + rs.getString("JenisObat") + "\n");
                resultArea.append("Harga: " + rs.getDouble("Harga") + "\n");
                resultArea.append("Keterangan Tambahan: " + rs.getString("KeteranganTambahan") + "\n");
                resultArea.append("====================\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Gagal menampilkan data.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ApotekGUI();
            }
        });
    }
}
