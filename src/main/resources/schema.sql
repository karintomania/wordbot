DROP TABLE IF EXISTS public.word_master;
DROP SEQUENCE IF EXISTS word_master_id_seq;

CREATE TABLE public.word_master (
	id serial NOT NULL,
	word varchar NULL,
	definition varchar NULL,
	CONSTRAINT word_master_pkey PRIMARY KEY (id)
);

INSERT INTO public.word_master (word, definition) VALUES('word1','def1');
INSERT INTO public.word_master (word, definition) VALUES('word2','def2');
INSERT INTO public.word_master (word, definition) VALUES('word3','def3');
INSERT INTO public.word_master (word, definition) VALUES('word4','def4');
INSERT INTO public.word_master (word, definition) VALUES('word5','def5');
INSERT INTO public.word_master (word, definition) VALUES('word6','def6');
INSERT INTO public.word_master (word, definition) VALUES('word7','def7');
INSERT INTO public.word_master (word, definition) VALUES('word8','def8');
INSERT INTO public.word_master (word, definition) VALUES('word9','def9');
INSERT INTO public.word_master (word, definition) VALUES('word10','def10');
INSERT INTO public.word_master (word, definition) VALUES('word11','def11');
INSERT INTO public.word_master (word, definition) VALUES('word12','def12');
INSERT INTO public.word_master (word, definition) VALUES('word13','def13');
INSERT INTO public.word_master (word, definition) VALUES('word14','def14');
INSERT INTO public.word_master (word, definition) VALUES('word15','def15');
INSERT INTO public.word_master (word, definition) VALUES('word16','def16');
INSERT INTO public.word_master (word, definition) VALUES('word17','def17');
INSERT INTO public.word_master (word, definition) VALUES('word18','def18');
INSERT INTO public.word_master (word, definition) VALUES('word19','def19');
INSERT INTO public.word_master (word, definition) VALUES('word20','def20');

-- ALTER TABLE public.word_master OWNER TO shimizu;
-- GRANT ALL ON TABLE public.word_master TO shimizu;
-- GRANT ALL ON TABLE public.word_master TO words;
