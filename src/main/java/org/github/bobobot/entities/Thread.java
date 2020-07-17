package org.github.bobobot.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Thread {
	int ID;
	String title;
	Board board;
	List<Reply> replies = new ArrayList<>();
	User user;

	public Thread(int ID, String title, Board board, User user, List<Reply> replies) {
		this.ID = ID;
		this.title = title;
		this.board = board;
		this.user = user;
		this.replies = replies;
	}

	public Thread(int ID, String title, Board board, User user) {
		this.ID = ID;
		this.title = title;
		this.board = board;
		this.user = user;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Thread thread = (Thread) o;
		return ID == thread.ID &&
				title.equals(thread.title) &&
				board.equals(thread.board) &&
				replies.equals(thread.replies) &&
				user.equals(thread.user);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, title, board, replies, user);
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}

	public void addReply(Reply reply) {
		this.replies.add(reply);
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
