package org.github.bobobot.dao;

import org.github.bobobot.entities.Reply;
import org.github.bobobot.entities.Thread;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

/**
 * This interface defines a DAO of a reply.
 */
public interface ReplyDAO {

    /**
     * Creates a reply.
     * @param content The content of the reply.
     * @param date The date of the reply.
     * @param votes The summarized score of the reply.
     * @param thread The thread the reply belongs to.
     * @return The created reply.
     */
    Reply create(String content, LocalDateTime date, int votes, Thread thread);

    /**
     * Updates a reply.
     * @param ID The ID of the reply.
     * @param content The content of the reply.
     * @param date The date of the reply.
     * @param votes The summarized score of the reply.
     * @param thread The thread the reply belongs to.
     * @return
     */
    Optional<Reply> update(int ID, String content, LocalDateTime date, int votes, Thread thread);

    /**
     * Selects a reply by its ID.
     * @param ID The ID of the reply to be selected
     * @return The selected reply, wrapped in an optional.
     */
    Optional<Reply> select(int ID);

    /**
     * Lists all replies.
     * @return A list of all replies.
     */
    ArrayList<Reply> list();

    /**
     * Deletes a reply.
     * @param ID The ID of the reply to be deleted.
     * @return The deleted reply.
     */
    Optional<Reply> delete(int ID);
}