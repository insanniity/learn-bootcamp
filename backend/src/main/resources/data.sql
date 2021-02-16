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

INSERT INTO tbl_courses (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp HTML', 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 'https://upload.wikimedia.org/wikipedia/commons/1/1f/Switch-course-book-grey.svg');

INSERT INTO tbl_offers (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2021-04-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2022-11-20T03:00:00Z', 1);
INSERT INTO tbl_offers (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2021-05-20T03:00:00Z', TIMESTAMP WITH TIME ZONE '2022-12-20T03:00:00Z', 1);


INSERT INTO tbl_resources (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha HTML', 'Trilha principal do curso', 1, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, 1);
INSERT INTO tbl_resources (title, description, position, img_Uri, type, offer_id) VALUES ('Forum', 'Tire suas dúvidas', 2, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 2, 1);
INSERT INTO tbl_resources (title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 0, 1);