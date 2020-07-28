package org.github.bobobot.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public abstract class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	boolean read = false;

	@ManyToOne
	@NonNull
	Reply originalReply;

	public Notification(boolean read, @NonNull Reply originalReply) {
		this.read = read;
		this.originalReply = originalReply;
	}

	public User getUser() {
		return originalReply.getUser();
	}
}
