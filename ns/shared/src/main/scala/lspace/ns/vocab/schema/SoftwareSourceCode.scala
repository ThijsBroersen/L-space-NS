package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SoftwareSourceCode extends OntologyDef(
        iri = "http://schema.org/SoftwareSourceCode",
        iris = Set("http://schema.org/SoftwareSourceCode"),
        label = "SoftwareSourceCode",
        comment = """Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val codeRepository = lspace.ns.vocab.schema.codeRepository.property
lazy val codeSampleType = lspace.ns.vocab.schema.codeSampleType.property
lazy val programmingLanguage = lspace.ns.vocab.schema.programmingLanguage.property
lazy val runtimePlatform = lspace.ns.vocab.schema.runtimePlatform.property
lazy val targetProduct = lspace.ns.vocab.schema.targetProduct.property
}
override lazy val properties: List[LProperty] = List(codeRepository, codeSampleType, programmingLanguage, runtimePlatform, targetProduct)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val codeRepository = lspace.ns.vocab.schema.codeRepository.property
lazy val codeSampleType = lspace.ns.vocab.schema.codeSampleType.property
lazy val programmingLanguage = lspace.ns.vocab.schema.programmingLanguage.property
lazy val runtimePlatform = lspace.ns.vocab.schema.runtimePlatform.property
lazy val targetProduct = lspace.ns.vocab.schema.targetProduct.property
}
}