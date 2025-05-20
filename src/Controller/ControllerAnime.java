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

    public void fetchAnime(){
        listAnime = daoAnime.fetchTopAnime(1); // ambil page 1 misalnya
        // Kirim data ke view
        halamanDashboard.displayAnimeList(listAnime);
    }
}

