package com.javatpoint.model;
import javax.persistence.*;

@Entity

@Table
public class Lesson
{

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int credit;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getCredit()
    {
        return credit;
    }
    public void setCredit(int credit)
    {
        this.credit = credit;
    }

}