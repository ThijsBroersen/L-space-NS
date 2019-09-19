package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Vehicle extends OntologyDef(
        iri = "http://schema.org/Vehicle",
        iris = Set("http://schema.org/Vehicle"),
        label = "Vehicle",
        comment = """A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.""",
        `@extends` = () => List(Product.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Product.Properties{
lazy val accelerationTime = lspace.ns.vocab.schema.accelerationTime.property
lazy val bodyType = lspace.ns.vocab.schema.bodyType.property
lazy val cargoVolume = lspace.ns.vocab.schema.cargoVolume.property
lazy val dateVehicleFirstRegistered = lspace.ns.vocab.schema.dateVehicleFirstRegistered.property
lazy val driveWheelConfiguration = lspace.ns.vocab.schema.driveWheelConfiguration.property
lazy val emissionsCO2 = lspace.ns.vocab.schema.emissionsCO2.property
lazy val fuelCapacity = lspace.ns.vocab.schema.fuelCapacity.property
lazy val fuelConsumption = lspace.ns.vocab.schema.fuelConsumption.property
lazy val fuelEfficiency = lspace.ns.vocab.schema.fuelEfficiency.property
lazy val fuelType = lspace.ns.vocab.schema.fuelType.property
lazy val knownVehicleDamages = lspace.ns.vocab.schema.knownVehicleDamages.property
lazy val meetsEmissionStandard = lspace.ns.vocab.schema.meetsEmissionStandard.property
lazy val mileageFromOdometer = lspace.ns.vocab.schema.mileageFromOdometer.property
lazy val modelDate = lspace.ns.vocab.schema.modelDate.property
lazy val numberOfAirbags = lspace.ns.vocab.schema.numberOfAirbags.property
lazy val numberOfAxles = lspace.ns.vocab.schema.numberOfAxles.property
lazy val numberOfDoors = lspace.ns.vocab.schema.numberOfDoors.property
lazy val numberOfForwardGears = lspace.ns.vocab.schema.numberOfForwardGears.property
lazy val numberOfPreviousOwners = lspace.ns.vocab.schema.numberOfPreviousOwners.property
lazy val payload = lspace.ns.vocab.schema.payload.property
lazy val seatingCapacity = lspace.ns.vocab.schema.seatingCapacity.property
lazy val speed = lspace.ns.vocab.schema.speed.property
lazy val steeringPosition = lspace.ns.vocab.schema.steeringPosition.property
lazy val tongueWeight = lspace.ns.vocab.schema.tongueWeight.property
lazy val trailerWeight = lspace.ns.vocab.schema.trailerWeight.property
lazy val vehicleConfiguration = lspace.ns.vocab.schema.vehicleConfiguration.property
lazy val vehicleEngine = lspace.ns.vocab.schema.vehicleEngine.property
lazy val vehicleIdentificationNumber = lspace.ns.vocab.schema.vehicleIdentificationNumber.property
lazy val vehicleInteriorColor = lspace.ns.vocab.schema.vehicleInteriorColor.property
lazy val vehicleInteriorType = lspace.ns.vocab.schema.vehicleInteriorType.property
lazy val vehicleModelDate = lspace.ns.vocab.schema.vehicleModelDate.property
lazy val vehicleSeatingCapacity = lspace.ns.vocab.schema.vehicleSeatingCapacity.property
lazy val vehicleSpecialUsage = lspace.ns.vocab.schema.vehicleSpecialUsage.property
lazy val vehicleTransmission = lspace.ns.vocab.schema.vehicleTransmission.property
lazy val weightTotal = lspace.ns.vocab.schema.weightTotal.property
lazy val wheelbase = lspace.ns.vocab.schema.wheelbase.property
}
override lazy val properties: List[LProperty] = List(accelerationTime, bodyType, cargoVolume, dateVehicleFirstRegistered, driveWheelConfiguration, emissionsCO2, fuelCapacity, fuelConsumption, fuelEfficiency, fuelType, knownVehicleDamages, meetsEmissionStandard, mileageFromOdometer, modelDate, numberOfAirbags, numberOfAxles, numberOfDoors, numberOfForwardGears, numberOfPreviousOwners, payload, seatingCapacity, speed, steeringPosition, tongueWeight, trailerWeight, vehicleConfiguration, vehicleEngine, vehicleIdentificationNumber, vehicleInteriorColor, vehicleInteriorType, vehicleModelDate, vehicleSeatingCapacity, vehicleSpecialUsage, vehicleTransmission, weightTotal, wheelbase)
trait Properties extends lspace.ns.vocab.schema.Product.Properties{
lazy val accelerationTime = lspace.ns.vocab.schema.accelerationTime.property
lazy val bodyType = lspace.ns.vocab.schema.bodyType.property
lazy val cargoVolume = lspace.ns.vocab.schema.cargoVolume.property
lazy val dateVehicleFirstRegistered = lspace.ns.vocab.schema.dateVehicleFirstRegistered.property
lazy val driveWheelConfiguration = lspace.ns.vocab.schema.driveWheelConfiguration.property
lazy val emissionsCO2 = lspace.ns.vocab.schema.emissionsCO2.property
lazy val fuelCapacity = lspace.ns.vocab.schema.fuelCapacity.property
lazy val fuelConsumption = lspace.ns.vocab.schema.fuelConsumption.property
lazy val fuelEfficiency = lspace.ns.vocab.schema.fuelEfficiency.property
lazy val fuelType = lspace.ns.vocab.schema.fuelType.property
lazy val knownVehicleDamages = lspace.ns.vocab.schema.knownVehicleDamages.property
lazy val meetsEmissionStandard = lspace.ns.vocab.schema.meetsEmissionStandard.property
lazy val mileageFromOdometer = lspace.ns.vocab.schema.mileageFromOdometer.property
lazy val modelDate = lspace.ns.vocab.schema.modelDate.property
lazy val numberOfAirbags = lspace.ns.vocab.schema.numberOfAirbags.property
lazy val numberOfAxles = lspace.ns.vocab.schema.numberOfAxles.property
lazy val numberOfDoors = lspace.ns.vocab.schema.numberOfDoors.property
lazy val numberOfForwardGears = lspace.ns.vocab.schema.numberOfForwardGears.property
lazy val numberOfPreviousOwners = lspace.ns.vocab.schema.numberOfPreviousOwners.property
lazy val payload = lspace.ns.vocab.schema.payload.property
lazy val seatingCapacity = lspace.ns.vocab.schema.seatingCapacity.property
lazy val speed = lspace.ns.vocab.schema.speed.property
lazy val steeringPosition = lspace.ns.vocab.schema.steeringPosition.property
lazy val tongueWeight = lspace.ns.vocab.schema.tongueWeight.property
lazy val trailerWeight = lspace.ns.vocab.schema.trailerWeight.property
lazy val vehicleConfiguration = lspace.ns.vocab.schema.vehicleConfiguration.property
lazy val vehicleEngine = lspace.ns.vocab.schema.vehicleEngine.property
lazy val vehicleIdentificationNumber = lspace.ns.vocab.schema.vehicleIdentificationNumber.property
lazy val vehicleInteriorColor = lspace.ns.vocab.schema.vehicleInteriorColor.property
lazy val vehicleInteriorType = lspace.ns.vocab.schema.vehicleInteriorType.property
lazy val vehicleModelDate = lspace.ns.vocab.schema.vehicleModelDate.property
lazy val vehicleSeatingCapacity = lspace.ns.vocab.schema.vehicleSeatingCapacity.property
lazy val vehicleSpecialUsage = lspace.ns.vocab.schema.vehicleSpecialUsage.property
lazy val vehicleTransmission = lspace.ns.vocab.schema.vehicleTransmission.property
lazy val weightTotal = lspace.ns.vocab.schema.weightTotal.property
lazy val wheelbase = lspace.ns.vocab.schema.wheelbase.property
}
}