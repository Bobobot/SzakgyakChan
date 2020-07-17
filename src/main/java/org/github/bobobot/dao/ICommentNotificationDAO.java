package org.github.bobobot.dao;

import org.github.bobobot.entities.CommentNotification;

import java.util.List;
import java.util.Optional;

public interface ICommentNotificationDAO {
	/**
	 * Creates a notification.
	 *
	 * @param notification The notification to be created.
	 * @return The created notification.
	 */
	CommentNotification create(CommentNotification notification);

	/**
	 * Updates a notification.
	 *
	 * @param notification The notification to be updated.
	 * @return The updated notification.
	 */
	Optional<CommentNotification> update(CommentNotification notification);

	/**
	 * Selects a notiication by its ID.
	 *
	 * @param ID The ID of the notification to be selected.
	 * @return The selected notification, wrapped in an optional.
	 */
	Optional<CommentNotification> select(int ID);

	/**
	 * Lists all existing notifications.
	 *
	 * @return A list of all existing notifications.
	 */
	List<CommentNotification> list();

	/**
	 * Deletes a notification.
	 *
	 * @param ID The ID of the notification to be deleted.
	 * @return The deleted norification, wrapped in an optional.
	 */
	Optional<CommentNotification> delete(int ID);
}
