-- Database: crud

-- DROP DATABASE crud;

CREATE DATABASE crud
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'pt_BR.UTF-8'
       LC_CTYPE = 'pt_BR.UTF-8'
       CONNECTION LIMIT = -1;


-- Table: public.login

-- DROP TABLE public.login;

CREATE TABLE public.login
(
  email character varying(200),
  senha character varying(200),
  id integer NOT NULL DEFAULT nextval('login_id_seq'::regclass),
  CONSTRAINT login_pkey PRIMARY KEY (id),
  CONSTRAINT email_unique UNIQUE (email)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.login
  OWNER TO postgres;