package kozlovskiy.prod.service;

import kozlovskiy.prod.entities.Favorite;
import kozlovskiy.prod.repo.FavoriteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepo favoriteRepo;

    public List<Favorite> getUserFavorites(int userId) {
        return favoriteRepo.findByUserId(userId);
    }
}
