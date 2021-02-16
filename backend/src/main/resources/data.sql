INSERT INTO tbl_users (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tbl_users (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tbl_users (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tbl_roles (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tbl_roles (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tbl_roles (authority) VALUES ('ROLE_INSTRUCTOR');

INSERT INTO tbl_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tbl_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tbl_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tbl_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tbl_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tbl_user_role (user_id, role_id) VALUES (3, 3);