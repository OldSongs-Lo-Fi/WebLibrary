package library.ua.WebLibrary.Controllers;

import library.ua.WebLibrary.Ent.Book;
import library.ua.WebLibrary.Repo.BookRepo;
import library.ua.WebLibrary.Repo.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    final BookRepo bookRepo;
    final UserRepo usersRepo;
    public MainController(BookRepo bookRepo, UserRepo usersRepo) {
        this.bookRepo = bookRepo;
        this.usersRepo = usersRepo;
    }


    // Main Page Главная страница
    @GetMapping
    public String main(){
        return "/main_page";
    }


    //Personal Lobby Личный кабинет




    //Books list Список книжек
    @GetMapping("/books")
    public String booksList(Model model){
        //Добавляем список книжек в модель с помощью преобразования данных из репрезитория в тип Iterable
        Iterable<Book> bookIterable = bookRepo.findAll();
        model.addAttribute("books", bookIterable);
        return ("/book_list");
    }
    //POST Book List









    //About О нас
    @GetMapping("/about")
    public String about(){
        return "about";
    }

}
