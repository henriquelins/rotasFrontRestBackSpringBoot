INSERT INTO tb_usuario (data_de_nascimento, login, nome, senha, sobrenome) VALUES ('1970-12-12', 'jota', 'Juarez', '1010', 'Antunes');

INSERT INTO tb_automovel (ano, cor, modelo, placa) VALUES ('1990-12-12', 'prata', 'monza', 'gta9090');
INSERT INTO tb_automovel (ano, cor, modelo, placa) VALUES ('1978-12-12', 'branco', 'corcel', 'gtx4545');

INSERT INTO tb_usuario_automovel (usuario_id, automovel_id) VALUES (1, 1);
INSERT INTO tb_usuario_automovel (usuario_id, automovel_id) VALUES (2, 1);
