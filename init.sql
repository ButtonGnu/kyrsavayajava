DROP TABLE IF EXISTS public.employees;

CREATE TABLE IF NOT EXISTS public.employees
(
    id integer NOT NULL DEFAULT nextval('employees_id_seq'::regclass),
    first_name character varying COLLATE  NOT NULL,
    last_name character varying COLLATE  NOT NULL,
    job_position character varying COLLATE  NOT NULL,
    CONSTRAINT employees_pkey PRIMARY KEY (id)
);

 DROP TABLE IF EXISTS public.customers;

CREATE TABLE IF NOT EXISTS public.customers
(
    id integer NOT NULL DEFAULT nextval('customers_id_seq'::regclass),
    first_name character varying COLLATE  NOT NULL,
    last_name character varying COLLATE  NOT NULL,
    request_id bigint NOT NULL,
    CONSTRAINT customers_pkey PRIMARY KEY (id)
);

DROP TABLE IF EXISTS public.requests;

CREATE TABLE IF NOT EXISTS public.requests
(
    id integer NOT NULL DEFAULT nextval('requests_id_seq'::regclass),
    customer_id bigint NOT NULL,
    employee_id bigint,
    request_status character varying COLLATE  NOT NULL,
    execution_stage character varying COLLATE  NOT NULL,
    CONSTRAINT requests_pkey PRIMARY KEY (id),
    CONSTRAINT requests_customer_id_fkey FOREIGN KEY (customer_id)
        REFERENCES public.customers (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT requests_employee_id_fkey FOREIGN KEY (employee_id)
        REFERENCES public.employees (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);