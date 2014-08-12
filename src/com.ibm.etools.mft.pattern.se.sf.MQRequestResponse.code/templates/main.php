<?php
$loggingRequired = $_MB['PP']['pp9'] == 'true';
$errorHandlingRequired = $_MB['PP']['pp12'] == 'true';

if ($loggingRequired) {
     mb_pattern_run_template("MQRequestResponseProject", "mqsi/Log.esql.php", "mqsi/Log.esql");
}

if ($errorHandlingRequired) {
     mb_pattern_run_template("MQRequestResponseProject", "mqsi/Error.esql.php", "mqsi/Error.esql");
}
?>