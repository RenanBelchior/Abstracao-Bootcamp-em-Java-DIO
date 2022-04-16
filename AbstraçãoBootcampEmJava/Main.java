package Abstra��oBootcampEmJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	Curso curso1 = new Curso();
	curso1.setTitulo("curso java");
	curso1.setDescri�ao("descri��o curso java");
	curso1.setCargahoraria(8);

	Curso curso2 = new Curso();
	curso2.setTitulo("curso java");
	curso2.setDescri�ao("descri��o curso java");
	curso2.setCargahoraria(4);
	
	Conteudo conteudo = new Curso();
	Conteudo conteudo1 = new Mentoria();
	
	List<String> palavras = new ArrayList();
	
	Mentoria mentoria = new Mentoria();
	mentoria.setTitulo("mentoria de java");
	mentoria.setDescri�ao("descri��o mentoria java");
	mentoria.setData(LocalDate.now());
	
	
	
	/**System.out.println(curso1);
	System.out.println(curso2);
	System.out.println(mentoria);**/
	
	Bootcamp bootcamp = new Bootcamp();
	bootcamp.setNome("Bootcamp Java Developer");
	bootcamp.setDescri�ao("Descri��o Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);
    
    Dev devRenan = new Dev();
    devRenan.setNome("Renan");
    devRenan.inscreverBootcamp(bootcamp);
    System.out.println("Conte�dos Inscritos Renan: " + devRenan.getConteudoInscritos());
	devRenan.progredir();
	System.out.println("-");
	System.out.println("Conte�dos Inscritos Renan: " + devRenan.getConteudoInscritos());
	System.out.println("Conte�dos Conclu�dos Renan: " + devRenan.getConteudosConcluidos());
    System.out.println("XP: " + devRenan.calcularTotalXp());
	
    System.out.println("--------------");
	
    Dev devCamilla = new Dev();
    devCamilla.setNome("Camilla");
    devCamilla.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos" + devCamilla.getConteudoInscritos());
	devCamilla.progredir();
	devCamilla.progredir();
	devCamilla.progredir();
	System.out.println("-");
	System.out.println("Conte�dos Inscritos Camilla: " + devCamilla.getConteudoInscritos());
	System.out.println("Conte�dos Conclu�dos Camilla: " + devCamilla.getConteudosConcluidos());
	System.out.println("XP: " + devCamilla.calcularTotalXp());
	}
}
