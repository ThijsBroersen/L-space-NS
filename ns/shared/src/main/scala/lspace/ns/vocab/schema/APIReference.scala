package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object APIReference extends OntologyDef(
        iri = "http://schema.org/APIReference",
        iris = Set("http://schema.org/APIReference"),
        label = "APIReference",
        comment = """Reference documentation for application programming interfaces (APIs).""",
        `@extends` = () => List(TechArticle.ontology)
       ){
object keys extends lspace.ns.vocab.schema.TechArticle.Properties{
lazy val assemblyVersion = lspace.ns.vocab.schema.assemblyVersion.property
lazy val executableLibraryName = lspace.ns.vocab.schema.executableLibraryName.property
lazy val programmingModel = lspace.ns.vocab.schema.programmingModel.property
lazy val targetPlatform = lspace.ns.vocab.schema.targetPlatform.property
}
override lazy val properties: List[LProperty] = List(assemblyVersion, executableLibraryName, programmingModel, targetPlatform)
trait Properties extends lspace.ns.vocab.schema.TechArticle.Properties{
lazy val assemblyVersion = lspace.ns.vocab.schema.assemblyVersion.property
lazy val executableLibraryName = lspace.ns.vocab.schema.executableLibraryName.property
lazy val programmingModel = lspace.ns.vocab.schema.programmingModel.property
lazy val targetPlatform = lspace.ns.vocab.schema.targetPlatform.property
}
}