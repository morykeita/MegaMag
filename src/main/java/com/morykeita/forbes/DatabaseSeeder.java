package com.morykeita.forbes;

import com.morykeita.forbes.entity.Article;
import com.morykeita.forbes.entity.builder.ArticleBuilder;
import com.morykeita.forbes.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private ArticleRepository articleRepository;

    @Autowired
    public DatabaseSeeder(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        List<Article> articles = new ArrayList<>();

        String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        articles.add(new ArticleBuilder().title("Bitcoin Spikes To Fresh 2020 High").category("Money").content(content).author("Charles Bovaird").build());
        articles.add(new ArticleBuilder().title("Black In Business: Celebrating The Legacy Of Black Entrepreneurship").category("Money").content(content).author("Ruth Umoh").build());
        articles.add(new ArticleBuilder().title("The Problem of Evil").category("Scifi").content(content).author("Ahmed Ali").build());
        articles.add(new ArticleBuilder().title("Who ruined Game of thrones").category("Movies").content(content).author("Ahmed Ali").build());
        articles.add(new ArticleBuilder().title("7 Rules For A Wealthy Retirement").category("Money").content(content).author("William Baldwin").build());
        articles.add(new ArticleBuilder().title("Arsenal: Kings of London").category("Sport").content(content).author("AFTV").build());
        articles.add(new ArticleBuilder().title("New York Today").category("News").content(content).author("Jame Savic").build());
        articles.add(new ArticleBuilder().title("Golang tutorial").category("Tech").content(content).author("Mory Keita").build());
        articles.add(new ArticleBuilder().title("A spy's story").category("Tech").content(content).author("Mr X").build());
        articles.add(new ArticleBuilder().title("The Bolt").category("Sport").content(content).author("Jon Jules").build());
        articles.add(new ArticleBuilder().title("How to make quick money").category("Money").content(content).author("William Baldwin").build());
        articles.add(new ArticleBuilder().title("5 Perfect Whisky Gifts For Valentine’s Day").category("Felipe Schrieberg").content(content).author("William Baldwin").build());
        articles.add(new ArticleBuilder().title("7 Perfect Dance moves For Valentine’s Day").category("LifeStyle").content(content).author("William Baldwin").build());
        articles.add(new ArticleBuilder().title("I am Drake").category("Music").content(content).author("Drake").build());
        articles.add(new ArticleBuilder().title("Henry:The return of the King").category("Money").content(content).author("AFTV").build());
        articles.add(new ArticleBuilder().title("7 Rules For A Wealthy Retirement").category("Money").content(content).author("William Baldwin").build());
        articles.add(new ArticleBuilder().title("Oscars 2020: The Best Of The Red Carpet").category("LyfeStyle").content(content).author("Kristin Tablang").build());
        articles.add(new ArticleBuilder().title("Build awesome mobile with Flutter").category("Tech").content(content).author("Mory Keita").build());
        articles.add(new ArticleBuilder().title("Your guide to african food").category("Tech").content(content).author("Aly Keita").build());
        articles.add(new ArticleBuilder().title("Secrets of Area 51").category("Scifi").content(content).author("Naruto").build());
        articles.add(new ArticleBuilder().title("The nerd's guide to wealth").category("Money").content(content).author("Bill Gate").build());
        articles.add(new ArticleBuilder().title("My next big thing").category("Music").content(content).author("Drake").build());
        articles.add(new ArticleBuilder().title("The geeks shall inherit the earth").category("Tech").content(content).author("Mory Keita").build());
        articles.add(new ArticleBuilder().title("How to dress with swagger").category("Tech").content(content).author("Amy Cohen").build());
        articles.add(new ArticleBuilder().title("The rise of fintech").category("Tech").content(content).author("Ahmed Ali").build());
        articles.add(new ArticleBuilder().title("The great awakening").category("Scifi").content(content).author("Liz Smith").build());
        articles.add(new ArticleBuilder().title("The World's Most Powerful People 2018").category("Tech").content(content).author("David M. Ewalt").build());
        articles.add(new ArticleBuilder().title("Three Point Play: Inside Kevin Durant’s Multimillion-Dollar Basketball, Media and Investing Empire").category("Tech").content(content).author("Steven Bertoni").build());
        articles.add(new ArticleBuilder().title("Get rich today").category("Money").content(content).author("Mike Martinez").build());
        articles.add(new ArticleBuilder().title("Mobile World Congress Canceled: Why You Should Care").category("Tech").content(content).author("David Phelan").build());
        articles.add(new ArticleBuilder().title("Older Workers Deserve Your Company’s Love Too").category("Leadership").content(content).author("Grant Freeland").build());
        articles.add(new ArticleBuilder().title("Why New York").category("Tech").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("Election 2020").category("Politics").content(content).author("Anderson Cooper").build());
        articles.add(new ArticleBuilder().title("Why Boston").category("Money").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("Drugs From Bugs: Why Gates, Zuck And Benioff Think The Next Blockbusters Will Come From Inside Your Gut").category("Education").content(content).author("Susan Adams").build());
        articles.add(new ArticleBuilder().title("Your Guide to France").category("Tech").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("Why New York").category("Tech").content(content).author("Liz Smith").build());
        articles.add(new ArticleBuilder().title("Best dating apps of 2020").category("Tech").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("Africa’s Richest People—And The Tycoon Who Lost Half His Fortune").category("Billionaires").content(content).author("Kerry A. Dolan").build());
        articles.add(new ArticleBuilder().title("Why New York").category("Tech").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("The Best Budgeting Apps In 2020").category("Advisor").content(content).author("Kristin Stolle").build());
        articles.add(new ArticleBuilder().title("Why New York").category("Tech").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("Best Laptops for developers").category("Tech").content(content).author("Mory Keita").build());
        articles.add(new ArticleBuilder().title("Ex-Google Engineer And Silicon Valley Tech Money Tied To Shadow, The App That Brought Chaos To The Iowa Caucus").category("Billionaires").content(content).author("Angel Au-Yeung").build());
        articles.add(new ArticleBuilder().title("Why I love New York").category("Tech").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("The Forbes Guide to Credit Cards").category("Tech").content(content).author("Asia Martin").build());
        articles.add(new ArticleBuilder().title("Oscars 2020: The Best Of The Red Carpet").category("Tech").content(content).author("Kristin Tablang").build());
        articles.add(new ArticleBuilder().title("What Is ‘Parasite’ Really About?").category("Arts").content(content).author("Dani Di Placido").build());
        articles.add(new ArticleBuilder().title("Swiss Bank CEO Forced Out After Reports Of Spying On Two Former Executives").category("Carreers").content(content).author("Jack Kelly").build());
        articles.add(new ArticleBuilder().title("The ultimate guide to Scifi movies").category("Scifi").content(content).author("Liz Smith").build());
        articles.add(new ArticleBuilder().title("Nevada Union Says Sanders Supporters Harassed Members Over Medicare-For-All").category("Breaking").content(content).author("Rachel Sandler").build());
        articles.add(new ArticleBuilder().title("Election 2020").category("Politics").content(content).author("Anderson Cooper").build());
        articles.add(new ArticleBuilder().title("Why Boston").category("Money").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("Drugs From Bugs: Why Gates, Zuck And Benioff Think The Next Blockbusters Will Come From Inside Your Gut").category("Education").content(content).author("Susan Adams").build());
        articles.add(new ArticleBuilder().title("Your Guide to France").category("Tech").content(content).author("King Kong").build());
        articles.add(new ArticleBuilder().title("7 Rules For A Wealthy Retirement").category("Money").content(content).author("William Baldwin").build());
        articles.add(new ArticleBuilder().title("Arsenal: Kings of London").category("Sport").content(content).author("AFTV").build());
        articles.add(new ArticleBuilder().title("New York Today").category("News").content(content).author("Jame Savic").build());
        articles.add(new ArticleBuilder().title("Golang tutorial").category("Tech").content(content).author("Mory Keita").build());
        articles.add(new ArticleBuilder().title("A spy's story").category("Tech").content(content).author("Mr X").build());
        articles.add(new ArticleBuilder().title("The Bolt").category("Sport").content(content).author("Jon Jules").build());
        articles.add(new ArticleBuilder().title("Best Laptops for developers").category("Tech").content(content).author("Mory Keita").build());
        articleRepository.saveAll(articles);
    }

}
