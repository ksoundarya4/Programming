package com.bridgelabs.LogicalPrograms;

import java.util.Scanner;

public class TicTacToe {
	
	
	private String[][] board;
	private static final int rows = 3;
	private static final int colms = 3;
	private static final String NoInput= "   ";
	
	public TicTacToe() {
		this.board = new String[rows][colms];
	}
	
	public void InitializeBoard()
	{
		for(int i =0; i<rows; i++)
		{
			for(int j=0;j<colms; j++)
			{
				board[i][j]=NoInput;
			}
		}
	}
	
	public String PrintBoard()
	{
		String strBoard = "";
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<colms; j++)
			{
				if(j!=colms-1)
					strBoard = strBoard+board[i][j]+"|";
				else
					strBoard = strBoard+board[i][j];
				
			}
			if(i!=colms-1)
				strBoard+="\n---+---+---\n";
		}
		return strBoard;
	}

	
	public void setPlay(int i, int j , String str)
	{
		if(this.board[i][j].matches(NoInput))
			this.board[i][j] = str;
	}
	
	public boolean isGameOver()
	{
		for(int i = 0; i<rows; i++)
		{
			if(!board[i][0].matches(NoInput) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]))
				return true;
		}
		
		for(int i =0; i<colms; i++)
		{
			if(!board[0][i].matches(NoInput) && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
				return true;
		}
		
		if(!board[0][0].matches(NoInput) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
			return true;
		
		if(!board[2][0].matches(NoInput) && board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]))
			return true;
		
		return false;
		
		}
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String Player = "1";
		TicTacToe game= new TicTacToe();
		game.InitializeBoard();
		
		do {
			System.out.println(game.PrintBoard());
			if(Player.equals("1"))
			{
				System.out.println("Player 1 ");
				int row = (int)(Math.random()*10)%3;
				int col = (int)(Math.random()*10)%3;
				String s = " O ";
				game.setPlay(row, col, s);
				game.PrintBoard();
			}
			else
			{
				System.out.println("Player 2");
				System.out.println("Enter coordinates for rows :");
				int row = input.nextInt();
				
				System.out.println("Enter coordinates for colms :");
				int col = input.nextInt();
				
				String s = " X ";
				game.setPlay(row, col, s);
				game.PrintBoard();
			}
			
			if(game.isGameOver())
			{
				System.out.println(game.PrintBoard()+"\n"+"Player "+Player+"Wins");
				break;
			}
			
			if(Player == "1")
				Player = "2";
			else
				Player = "1";
		}while(true);
		
		
		
	}
}

