package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SoftwareApplication extends OntologyDef(
        iri = "http://schema.org/SoftwareApplication",
        iris = Set("http://schema.org/SoftwareApplication"),
        label = "SoftwareApplication",
        comment = """A software application.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val applicationCategory = lspace.ns.vocab.schema.applicationCategory.property
lazy val applicationSubCategory = lspace.ns.vocab.schema.applicationSubCategory.property
lazy val applicationSuite = lspace.ns.vocab.schema.applicationSuite.property
lazy val availableOnDevice = lspace.ns.vocab.schema.availableOnDevice.property
lazy val countriesNotSupported = lspace.ns.vocab.schema.countriesNotSupported.property
lazy val countriesSupported = lspace.ns.vocab.schema.countriesSupported.property
lazy val downloadUrl = lspace.ns.vocab.schema.downloadUrl.property
lazy val featureList = lspace.ns.vocab.schema.featureList.property
lazy val fileSize = lspace.ns.vocab.schema.fileSize.property
lazy val installUrl = lspace.ns.vocab.schema.installUrl.property
lazy val memoryRequirements = lspace.ns.vocab.schema.memoryRequirements.property
lazy val operatingSystem = lspace.ns.vocab.schema.operatingSystem.property
lazy val permissions = lspace.ns.vocab.schema.permissions.property
lazy val processorRequirements = lspace.ns.vocab.schema.processorRequirements.property
lazy val releaseNotes = lspace.ns.vocab.schema.releaseNotes.property
lazy val screenshot = lspace.ns.vocab.schema.screenshot.property
lazy val softwareAddOn = lspace.ns.vocab.schema.softwareAddOn.property
lazy val softwareHelp = lspace.ns.vocab.schema.softwareHelp.property
lazy val softwareRequirements = lspace.ns.vocab.schema.softwareRequirements.property
lazy val softwareVersion = lspace.ns.vocab.schema.softwareVersion.property
lazy val storageRequirements = lspace.ns.vocab.schema.storageRequirements.property
lazy val supportingData = lspace.ns.vocab.schema.supportingData.property
}
override lazy val properties: List[LProperty] = List(applicationCategory, applicationSubCategory, applicationSuite, availableOnDevice, countriesNotSupported, countriesSupported, downloadUrl, featureList, fileSize, installUrl, memoryRequirements, operatingSystem, permissions, processorRequirements, releaseNotes, screenshot, softwareAddOn, softwareHelp, softwareRequirements, softwareVersion, storageRequirements, supportingData)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val applicationCategory = lspace.ns.vocab.schema.applicationCategory.property
lazy val applicationSubCategory = lspace.ns.vocab.schema.applicationSubCategory.property
lazy val applicationSuite = lspace.ns.vocab.schema.applicationSuite.property
lazy val availableOnDevice = lspace.ns.vocab.schema.availableOnDevice.property
lazy val countriesNotSupported = lspace.ns.vocab.schema.countriesNotSupported.property
lazy val countriesSupported = lspace.ns.vocab.schema.countriesSupported.property
lazy val downloadUrl = lspace.ns.vocab.schema.downloadUrl.property
lazy val featureList = lspace.ns.vocab.schema.featureList.property
lazy val fileSize = lspace.ns.vocab.schema.fileSize.property
lazy val installUrl = lspace.ns.vocab.schema.installUrl.property
lazy val memoryRequirements = lspace.ns.vocab.schema.memoryRequirements.property
lazy val operatingSystem = lspace.ns.vocab.schema.operatingSystem.property
lazy val permissions = lspace.ns.vocab.schema.permissions.property
lazy val processorRequirements = lspace.ns.vocab.schema.processorRequirements.property
lazy val releaseNotes = lspace.ns.vocab.schema.releaseNotes.property
lazy val screenshot = lspace.ns.vocab.schema.screenshot.property
lazy val softwareAddOn = lspace.ns.vocab.schema.softwareAddOn.property
lazy val softwareHelp = lspace.ns.vocab.schema.softwareHelp.property
lazy val softwareRequirements = lspace.ns.vocab.schema.softwareRequirements.property
lazy val softwareVersion = lspace.ns.vocab.schema.softwareVersion.property
lazy val storageRequirements = lspace.ns.vocab.schema.storageRequirements.property
lazy val supportingData = lspace.ns.vocab.schema.supportingData.property
}
}