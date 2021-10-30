<?php
require_once('car.php');

class Ubex extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct(($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }

}

?>