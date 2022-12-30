package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Gafanhoto;
import entities.Video;
import entities.Visualização;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Video> v = new ArrayList<>();	
		List<Gafanhoto> g = new ArrayList<>();
		
		
		System.out.print("Quantos vídeos deseja adicionar?");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			System.out.print("Titulo video #"+ (i+1)+": ");
			String title = sc.nextLine();
			v.add(new Video(title));
		}
		
		System.out.print("\nQuantos Gafanhotos deseja adicionar? ");
			int m = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < m; i++) {
			System.out.println("- Gafanhoto #"+ (i+1)+": ");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
		
			System.out.print("Idade: ");
			int idade = Integer.parseInt(sc.nextLine());
			
			System.out.print("Sexo: (m/f) ");
			char sexo = sc.nextLine().charAt(0);
			
			System.out.print("Login: ");
			String login = sc.nextLine();
			
			g.add(new Gafanhoto(name, idade, sexo, login));
		}
		
		assistir(g, v);
		char resp;
		
		do {
			System.out.print("Deseja assistir mais alguma coisa? (s/n) ");
			 resp = sc.nextLine().charAt(0);
			if(resp == 's') {
				assistir(g, v);
			}
			else {
				
			}
		}while(resp == 's');
		
		
	}
	
	
	public static void mostraVideo(List<Video> v) {
		System.out.println("\n ----- Videos: -----  ");
		for(Video video : v) {
			System.out.println("");
			System.out.println(video);
		}
	}
	
	public static void mostraGafanhoto(List<Gafanhoto> g) {
		System.out.println("\n ----- Gafanhotos: -----  ");
		for(Gafanhoto gafanhoto : g) {
			System.out.println("");
			System.out.println(gafanhoto);
		}
	}
	public static void assistir(List<Gafanhoto> g, List<Video> v ) {
		
		Scanner sc = new Scanner(System.in);
		
		mostraGafanhoto(g);
		
		int indexGafanhoto;
		int indexVideo;
		
		if(g.size() == 1) {
			 indexGafanhoto = 0;
		}
		else {
			System.out.print("\nQuem irá assistir? (index):");
			 indexGafanhoto = Integer.parseInt(sc.nextLine());
		}
		
		mostraVideo(v);
		if(v.size() == 1) {
			 indexVideo = 0;
		}
		else {
			System.out.print("Qual video? (index) ");
			 indexVideo = Integer.parseInt(sc.nextLine());
			
		}
		
		Visualização vis = new Visualização(g.get(indexGafanhoto), v.get(indexVideo));
		vis.avaliar(10);
		System.out.println(vis);
	}

}
