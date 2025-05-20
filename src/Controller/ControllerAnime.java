/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Anime.DAOAnime;
import Model.Anime.InterfaceDAOAnime;
import Model.Anime.ModelAnime;
import View.DashboardView;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author BINTORO
 */
public class ControllerAnime {

    InterfaceDAOAnime daoAnime;
    List<ModelAnime> listAnime;
    private final DashboardView halamanDashboard;

    public ControllerAnime(DashboardView halamanDashboard, int ID){
        this.halamanDashboard = halamanDashboard;
        this.daoAnime = new DAOAnime();
    }

    public void fetchAnime(int page){
        if (page < 1) {
            JOptionPane.showMessageDialog(halamanDashboard, "Tidak bisa ke halaman sebelumnya");
        }else{
            listAnime = daoAnime.fetchTopAnime(page); // ambil page 1 misalnya
        // Kirim data ke view
        halamanDashboard.displayAnimeList(listAnime);
        }
        
        
    }
    
    public void searchAnime(String query){
        listAnime = daoAnime.searchAnime(query);
        
        halamanDashboard.displayAnimeList(listAnime);
    }
}

