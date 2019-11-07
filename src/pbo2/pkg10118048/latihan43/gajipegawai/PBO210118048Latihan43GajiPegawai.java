/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan43.gajipegawai;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung gaji pegawai
 */
public class PBO210118048Latihan43GajiPegawai {

    public static void main(String[] args) {
        
        GajiPegawai gajiPegawai = new GajiPegawai();
        gajiPegawai.setNama("Rizki Adam Kurniawan");
        gajiPegawai.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajiPegawai.setUangTransport(250_000);
        gajiPegawai.setUangTunjangan(300_000);
        gajiPegawai.setGajiPokok(4_500_000);
        gajiPegawai.setTotalGaji(gajiPegawai.totalGaji(
                gajiPegawai.getUangTunjangan(), gajiPegawai.getUangTransport(),
                gajiPegawai.getGajiPokok()));
        gajiPegawai.tampilData(gajiPegawai.getNama(), gajiPegawai.getAlamat(), 
                gajiPegawai.getUangTunjangan(), gajiPegawai.getUangTransport(), 
                gajiPegawai.getGajiPokok(), gajiPegawai.getTotalGaji());
    }

}
