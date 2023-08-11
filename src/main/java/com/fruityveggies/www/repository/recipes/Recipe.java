package com.fruityveggies.www.repository.recipes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@Entity
@Table(name = "RECIPES")
@SequenceGenerator(name = "RECIPES_SEQ_GEN", sequenceName = "RECIPES_SEQ",allocationSize = 1)
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECIPES_SEQ_GEN")
    private Long id;
    
    @Column
    private Long recipe_id;
    
    @Column
    private String image;
    
    @Column
    private String title;
    
    @Column
    private String content;
    
    @Column
    private String cooking_time;
    
    @Column
    private String category_main;
    
    @Column
    private String category_sub;
    
    @Column
    private String hashtag;
    
    @Column
    private String reference_amount;
    
}
