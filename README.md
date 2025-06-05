# 🌊 Sistema de Detecção e Alerta de Enchentes

## 📘 Descrição

Este projeto consiste em uma API RESTful desenvolvida em **Java com Spring Boot**, que simula um sistema automatizado de **detecção**, **emissão de alertas** e **ações de controle** em casos de enchentes.  
É parte do projeto da disciplina **Técnicas Avançadas de Programação** do curso de **Engenharia Mecatrônica (2º ano)** da FIAP.

---

## 🎯 Funcionalidades

- Registro de dados de sensores (nível da água e clima).
- Emissão automática de alertas com base no nível da água.
- Simulação de ações de contenção (como ativação de barreiras).
- Histórico completo de sensores, alertas e ações.
- Banco de dados **H2 em arquivo** para persistência local.

---

## 🧱 Estrutura do Projeto

```plaintext
└── src
    ├── controller      # Endpoints REST
    ├── model           # Entidades JPA (Sensor, Alert, ControlAction)
    ├── repository      # Interfaces JPA para acesso ao banco
    └── service         # Regras de negócio
