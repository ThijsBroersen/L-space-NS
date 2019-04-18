package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Role extends OntologyDef(
        iri = "http://schema.org/Role",
        iris = Set("http://schema.org/Role"),
        label = "Role",
        comment = """Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.<br/><br/>

See also <a href="http://blog.schema.org/2014/06/introducing-role.html">blog post</a>.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val roleName = lspace.ns.vocab.schema.roleName.property
}
override lazy val properties: List[LProperty] = List(roleName)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val roleName = lspace.ns.vocab.schema.roleName.property
}
}