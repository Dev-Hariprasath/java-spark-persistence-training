-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: revstox
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `stock_volatility_rank`
--

DROP TABLE IF EXISTS `stock_volatility_rank`;
/*!50001 DROP VIEW IF EXISTS `stock_volatility_rank`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `stock_volatility_rank` AS SELECT 
 1 AS `symbol`,
 1 AS `avg_volatility`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `price_volatility`
--

DROP TABLE IF EXISTS `price_volatility`;
/*!50001 DROP VIEW IF EXISTS `price_volatility`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `price_volatility` AS SELECT 
 1 AS `symbol`,
 1 AS `trade_date`,
 1 AS `volatility`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `volume_trends`
--

DROP TABLE IF EXISTS `volume_trends`;
/*!50001 DROP VIEW IF EXISTS `volume_trends`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `volume_trends` AS SELECT 
 1 AS `symbol`,
 1 AS `trade_date`,
 1 AS `volume`,
 1 AS `avg_vol_7`,
 1 AS `avg_vol_30`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `stock_ohlc`
--

DROP TABLE IF EXISTS `stock_ohlc`;
/*!50001 DROP VIEW IF EXISTS `stock_ohlc`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `stock_ohlc` AS SELECT 
 1 AS `symbol`,
 1 AS `trade_date`,
 1 AS `open_price`,
 1 AS `high_price`,
 1 AS `low_price`,
 1 AS `close_price`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `moving_averages`
--

DROP TABLE IF EXISTS `moving_averages`;
/*!50001 DROP VIEW IF EXISTS `moving_averages`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `moving_averages` AS SELECT 
 1 AS `symbol`,
 1 AS `trade_date`,
 1 AS `ma_7`,
 1 AS `ma_30`,
 1 AS `ma_90`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `daily_price_change`
--

DROP TABLE IF EXISTS `daily_price_change`;
/*!50001 DROP VIEW IF EXISTS `daily_price_change`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `daily_price_change` AS SELECT 
 1 AS `symbol`,
 1 AS `trade_date`,
 1 AS `price_change_percent`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `volume_price_change`
--

DROP TABLE IF EXISTS `volume_price_change`;
/*!50001 DROP VIEW IF EXISTS `volume_price_change`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `volume_price_change` AS SELECT 
 1 AS `symbol`,
 1 AS `avg_volume`,
 1 AS `avg_return`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `company_deliverable_ratio_view`
--

DROP TABLE IF EXISTS `company_deliverable_ratio_view`;
/*!50001 DROP VIEW IF EXISTS `company_deliverable_ratio_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `company_deliverable_ratio_view` AS SELECT 
 1 AS `trade_date`,
 1 AS `company_name`,
 1 AS `deliverable_ratio_percent`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vwap`
--

DROP TABLE IF EXISTS `vwap`;
/*!50001 DROP VIEW IF EXISTS `vwap`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vwap` AS SELECT 
 1 AS `symbol`,
 1 AS `trade_date`,
 1 AS `vwap`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `price_gaps`
--

DROP TABLE IF EXISTS `price_gaps`;
/*!50001 DROP VIEW IF EXISTS `price_gaps`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `price_gaps` AS SELECT 
 1 AS `symbol`,
 1 AS `trade_date`,
 1 AS `price_gap`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `company_turnover_view`
--

DROP TABLE IF EXISTS `company_turnover_view`;
/*!50001 DROP VIEW IF EXISTS `company_turnover_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `company_turnover_view` AS SELECT 
 1 AS `trade_date`,
 1 AS `turnover_crores`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `stock_volatility_rank`
--

/*!50001 DROP VIEW IF EXISTS `stock_volatility_rank`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `stock_volatility_rank` AS select `daily_prices`.`symbol` AS `symbol`,round(avg((((`daily_prices`.`high_price` - `daily_prices`.`low_price`) / nullif(`daily_prices`.`open_price`,0)) * 100)),2) AS `avg_volatility` from `daily_prices` group by `daily_prices`.`symbol` order by `avg_volatility` desc */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `price_volatility`
--

/*!50001 DROP VIEW IF EXISTS `price_volatility`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `price_volatility` AS select `daily_prices`.`symbol` AS `symbol`,`daily_prices`.`trade_date` AS `trade_date`,round((((`daily_prices`.`high_price` - `daily_prices`.`low_price`) / nullif(`daily_prices`.`open_price`,0)) * 100),2) AS `volatility` from `daily_prices` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `volume_trends`
--

/*!50001 DROP VIEW IF EXISTS `volume_trends`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `volume_trends` AS select `daily_prices`.`symbol` AS `symbol`,`daily_prices`.`trade_date` AS `trade_date`,`daily_prices`.`volume` AS `volume`,round(avg(`daily_prices`.`volume`) OVER (PARTITION BY `daily_prices`.`symbol` ORDER BY `daily_prices`.`trade_date` ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) ,2) AS `avg_vol_7`,round(avg(`daily_prices`.`volume`) OVER (PARTITION BY `daily_prices`.`symbol` ORDER BY `daily_prices`.`trade_date` ROWS BETWEEN 29 PRECEDING AND CURRENT ROW) ,2) AS `avg_vol_30` from `daily_prices` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `stock_ohlc`
--

/*!50001 DROP VIEW IF EXISTS `stock_ohlc`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `stock_ohlc` AS select `daily_prices`.`symbol` AS `symbol`,`daily_prices`.`trade_date` AS `trade_date`,`daily_prices`.`open_price` AS `open_price`,`daily_prices`.`high_price` AS `high_price`,`daily_prices`.`low_price` AS `low_price`,`daily_prices`.`close_price` AS `close_price` from `daily_prices` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `moving_averages`
--

/*!50001 DROP VIEW IF EXISTS `moving_averages`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `moving_averages` AS select `daily_prices`.`symbol` AS `symbol`,`daily_prices`.`trade_date` AS `trade_date`,round(avg(`daily_prices`.`close_price`) OVER (PARTITION BY `daily_prices`.`symbol` ORDER BY `daily_prices`.`trade_date` ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) ,2) AS `ma_7`,round(avg(`daily_prices`.`close_price`) OVER (PARTITION BY `daily_prices`.`symbol` ORDER BY `daily_prices`.`trade_date` ROWS BETWEEN 29 PRECEDING AND CURRENT ROW) ,2) AS `ma_30`,round(avg(`daily_prices`.`close_price`) OVER (PARTITION BY `daily_prices`.`symbol` ORDER BY `daily_prices`.`trade_date` ROWS BETWEEN 89 PRECEDING AND CURRENT ROW) ,2) AS `ma_90` from `daily_prices` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `daily_price_change`
--

/*!50001 DROP VIEW IF EXISTS `daily_price_change`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `daily_price_change` AS select `daily_prices`.`symbol` AS `symbol`,`daily_prices`.`trade_date` AS `trade_date`,round((((`daily_prices`.`close_price` - `daily_prices`.`open_price`) / nullif(`daily_prices`.`open_price`,0)) * 100),2) AS `price_change_percent` from `daily_prices` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `volume_price_change`
--

/*!50001 DROP VIEW IF EXISTS `volume_price_change`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `volume_price_change` AS select `daily_prices`.`symbol` AS `symbol`,round(avg(`daily_prices`.`volume`),2) AS `avg_volume`,round(avg((((`daily_prices`.`close_price` - `daily_prices`.`open_price`) / nullif(`daily_prices`.`open_price`,0)) * 100)),2) AS `avg_return` from `daily_prices` group by `daily_prices`.`symbol` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `company_deliverable_ratio_view`
--

/*!50001 DROP VIEW IF EXISTS `company_deliverable_ratio_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `company_deliverable_ratio_view` AS select `dp`.`trade_date` AS `trade_date`,`s`.`company_name` AS `company_name`,round((case when (`dp`.`volume` > 0) then ((`dp`.`volume` / `dp`.`volume`) * 100) else 0 end),2) AS `deliverable_ratio_percent` from (`daily_prices` `dp` join `stocks` `s` on((`dp`.`symbol` = `s`.`symbol`))) order by `dp`.`trade_date` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vwap`
--

/*!50001 DROP VIEW IF EXISTS `vwap`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vwap` AS select `daily_prices`.`symbol` AS `symbol`,`daily_prices`.`trade_date` AS `trade_date`,round((sum((`daily_prices`.`close_price` * `daily_prices`.`volume`)) OVER (PARTITION BY `daily_prices`.`symbol`,`daily_prices`.`trade_date` )  / nullif(sum(`daily_prices`.`volume`) OVER (PARTITION BY `daily_prices`.`symbol`,`daily_prices`.`trade_date` ) ,0)),2) AS `vwap` from `daily_prices` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `price_gaps`
--

/*!50001 DROP VIEW IF EXISTS `price_gaps`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `price_gaps` AS select `dp`.`symbol` AS `symbol`,`dp`.`trade_date` AS `trade_date`,(`dp`.`open_price` - lag(`dp`.`close_price`) OVER (PARTITION BY `dp`.`symbol` ORDER BY `dp`.`trade_date` ) ) AS `price_gap` from `daily_prices` `dp` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `company_turnover_view`
--

/*!50001 DROP VIEW IF EXISTS `company_turnover_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `company_turnover_view` AS select `dp`.`trade_date` AS `trade_date`,round(((`dp`.`close_price` * `dp`.`volume`) / 10000000),2) AS `turnover_crores` from (`daily_prices` `dp` join `stocks` `s` on((`dp`.`symbol` = `s`.`symbol`))) order by `dp`.`trade_date` limit 200 */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-10 22:15:22
