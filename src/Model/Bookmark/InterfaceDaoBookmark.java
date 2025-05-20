/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Bookmark;

import java.util.List;

/**
 *
 * @author BINTORO
 */
public interface InterfaceDaoBookmark {
    public void insertBookmark(ModelBookmark bookmark);
    public void updateBookmark(ModelBookmark bookmark);
    public void deleteBookmark(int userId, int animeId);
    public List<ModelBookmark> getBookmarksByUserId(int userId);
    
}
