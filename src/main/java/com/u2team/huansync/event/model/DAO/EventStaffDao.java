package com.u2team.huansync.event.model.DAO;

import com.u2team.huansync.event.DAO.ISaveDao;
import com.u2team.huansync.event.model.classes.EventStaff;
import com.u2team.huansync.persistence.BDConnection;
import com.u2team.huansync.persistence.Operations;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventStaffDao implements ISaveDao<EventStaff> {

    @Override
    public void save(EventStaff eventStaff) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stmInsert = "INSERT INTO tbl_staff_event VALUES (?,?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, eventStaff.getEventId());
            ps.setLong(2, eventStaff.getStaffId());

            int rows = Operations.insert_update_delete_db(ps);
            if (rows <= 0) {
                System.out.println("Cannot insert in table staff_event");




            } else {
                System.out.println("Successful insert in table staff_event");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
