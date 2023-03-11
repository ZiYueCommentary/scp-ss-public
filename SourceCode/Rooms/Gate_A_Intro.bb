
Function FillRoom_Gate_A_Intro(r.Rooms)
	Local i
	
	r\RoomDoors[0] = CreateDoor(0, r\x+1544.0*RoomScale,r\y, r\z-64.0*RoomScale, 90, r, False,DOOR_ELEVATOR)
	r\RoomDoors[0]\AutoClose = False : r\RoomDoors[0]\open = True : r\RoomDoors[0]\locked = True
	PositionEntity(r\RoomDoors[0]\buttons[0],r\x+1584*RoomScale, EntityY(r\RoomDoors[0]\buttons[0],True), r\z+80*RoomScale, True)
	PositionEntity(r\RoomDoors[0]\buttons[1],r\x+1456*RoomScale, EntityY(r\RoomDoors[0]\buttons[1],True), r\z-208*RoomScale, True)
	r\RoomDoors[1] = CreateDoor(0, r\x,r\y-2000.0*RoomScale,r\z,90,r,False,DOOR_ELEVATOR)
	r\RoomDoors[1]\AutoClose = False : r\RoomDoors[1]\open = False
	
	r\Objects[7] = CreatePivot()
	PositionEntity(r\Objects[7],r\x+1856.0*RoomScale,r\y+240.0*RoomScale,r\z-64.0*RoomScale,True)
	EntityParent r\Objects[7],r\obj
	
	;The helicopter
	r\Objects[0] = LoadMesh_Strict("GFX\map\apaches\helicopter.b3d")
	EntityParent r\Objects[0],r\obj
	
	;The big rotor
	r\Objects[4] = CopyEntity(ApacheRotorObj)
	EntityParent r\Objects[4],r\Objects[0]
	For i = -1 To 1 Step 2
		Local rotor2 = CopyEntity(r\Objects[4],r\Objects[4])
		RotateEntity rotor2,0,4.0*i,0
		EntityAlpha rotor2, 0.5
	Next
	PositionEntity r\Objects[4],-0.07,0.9,0.0,True
	
	;The small rotor
	r\Objects[5] = LoadAnimMesh_Strict("GFX\map\apaches\apacherotor2.b3d",r\Objects[0])
	PositionEntity r\Objects[5],0.3,4,-9.95
	RotateEntity r\Objects[5],0,180,-9
	
	;The starting point of the helicopter
	r\Objects[1] = CreatePivot()
	PositionEntity r\Objects[1],r\x-8596.0*RoomScale,r\y+1856.0*RoomScale,r\z+1568.0*RoomScale,True
	EntityParent r\Objects[1],r\obj
	
	;The first point where heli goes
	r\Objects[2] = CreatePivot()
	PositionEntity r\Objects[2],r\x+9100.0*RoomScale,r\y+1856.0*RoomScale,r\z+1568.0*RoomScale,True
	EntityParent r\Objects[2],r\obj
	
	;The second point where heli goes (landing)
	r\Objects[3] = CreatePivot()
	PositionEntity r\Objects[3],r\x+13170.0*RoomScale,r\y+618.0*RoomScale,r\z+1568.0*RoomScale,True
	EntityParent r\Objects[3],r\obj
	
	;A "black-out" sprite
	r\Objects[6] = CreateSprite(Camera)
	ScaleSprite r\Objects[6],3.0,3.0
	MoveEntity r\Objects[6],0,0,1
	EntityColor r\Objects[6],0,0,0
	EntityFX r\Objects[6],1
	EntityOrder r\Objects[6],-9000
	HideEntity r\Objects[6]
	
	r\Objects[8] = CreatePivot()
	PositionEntity(r\Objects[8],r\x,r\y-2000.0*RoomScale,r\z,True)
	EntityParent r\Objects[8],r\obj
	
	r\Objects[9]=CreatePivot()
	PositionEntity(r\Objects[9], r\x-798.063*RoomScale, r\y, r\z+7079.22*RoomScale, True)
	EntityParent r\Objects[9], r\obj	
	
	r\Objects[10]=CreatePivot()
	PositionEntity(r\Objects[10], r\x+798.063*RoomScale, r\y, r\z+6955.15*RoomScale, True)
	EntityParent r\Objects[10], r\obj	
	
	r\Objects[11]=CreatePivot()
	PositionEntity(r\Objects[11], r\x-17.3554*RoomScale, r\y,r\z+5100.81*RoomScale, True)
	EntityParent r\Objects[11], r\obj
	
	r\Objects[12]=CreatePivot()
	PositionEntity(r\Objects[12], r\x+1384.44*RoomScale, r\y,r\z+87.6457*RoomScale, True)
	EntityParent r\Objects[12], r\obj
	
	;Point where 3 apaches fly around
	r\Objects[13]=CreatePivot()
	PositionEntity(r\Objects[13], r\x+1216.0*RoomScale, 0, r\z+2112.0*RoomScale, True)
	EntityParent r\Objects[13], r\obj
	
	CreateDarkSprite(r, 14)
	
	CreateDarkSprite(r, 15)
	
	r\RoomDoors[2] = CreateDoor(r\zone, r\x - 4064.0 * RoomScale, (-1280.0+12000.0)*RoomScale, r\z + 3952.0 * RoomScale, 0, r, False)
	r\RoomDoors[2]\AutoClose = False : r\RoomDoors[2]\open = False : r\RoomDoors[2]\locked = True
	r\RoomDoors[3] = CreateDoor(r\zone,r\x + 0.0*RoomScale,r\y,r\z - 1008.0*RoomScale,0,r,False,False)
	r\RoomDoors[3]\AutoClose = False : r\RoomDoors[3]\open = False : r\RoomDoors[3]\locked = True
	
End Function

Function UpdateEvent_Gate_A_Intro(e.Events)
	Local n.NPCs
	Local i,it.Items,g.Guns
	
	If PlayerRoom = e\room Then
		
		CanSave = False
		
		If e\EventState[5] >= 70*6 Then
			ShouldPlay = Rand(MUS_INTRODUCTION_NTF,MUS_INTRODUCTION_NTF_2); ~ Intro Music
		Else
			ShouldPlay = MUS_NULL
			If e\Sound = 0 Then
				e\Sound = PlaySound_Strict(LoadTempSound("SFX\Music\Misc\Introduction_NTF.ogg"))
			EndIf
		EndIf
	EndIf
	
	If e\EventState[5] = 0 Then
		CreateSplashText("SCP - SECURITY STORIES",opt\GraphicWidth/2,opt\GraphicHeight/2,50,20,Font_Menu_Medium,True,False,10,20,200)
		CreateSplashText(GetLocalString("Singleplayer","ntf_operation"),opt\GraphicWidth/2,opt\GraphicHeight/2,20,5,Font_Digital_Small,True,False,10,20,200)
		psp\IsShowingHUD = False
		EntityAlpha e\room\Objects[15],1
		e\EventState[5] = 1
	EndIf
	
	If e\EventState[5] <> 0 Then
		e\EventState[5] = e\EventState[5] + fps\Factor[0]
	EndIf
	
	If e\EventState[5] >= 70*3 Then
		e\EventState[6] = e\EventState[6] - (0.01*fps\Factor[0])
		EntityAlpha e\room\Objects[15],Min(1,e\EventState[6]+3)
	EndIf
	
	If e\EventState[5] >= 70*5.0 And e\EventState[5] < 70*5.1 Then
		e\EventState[7] = 1
		If (Not TaskExists(TASK_CLASSIC_ARRIVE_AT_SITE)) Then
			If HUDenabled And psp\IsShowingHUD Then
				CreateSplashText(GetLocalString("Singleplayer","ntf_chapter_0"),opt\GraphicWidth/2,opt\GraphicHeight/2,100,5,Font_Default_Large,True,False)
			EndIf
			BeginTask(TASK_CLASSIC_ARRIVE_AT_SITE)
		EndIf
	ElseIf e\EventState[5] < 70*5.0 Then
		psp\IsShowingHUD = False
	EndIf
	
	If e\EventState[0] = 0
		
		Sky = sky_CreateSky("GFX\map\sky\sky_day")
		RotateEntity Sky,0,e\room\angle-90,0
		PositionEntity e\room\Objects[0],EntityX(e\room\Objects[1]),EntityY(e\room\Objects[1]),EntityZ(e\room\Objects[1])
		PointEntity e\room\Objects[0],e\room\Objects[2]
		e\Sound = LoadSound_Strict("SFX\Room\Intro\Helicopter.ogg")
		e\EventState[0] = 1
		e\EventState[2] = 1
		
		; ~ Items
		
		mpl\HasNTFGasmask = True
		wbi\Vest = True
		psp\Kevlar = 150
		psp\Helmet = 150
		
		Select Rand(0,3)
			Case 0
							;P90
				it = CreateItem("FN P90", "p90", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[0] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;F/S
				it = CreateItem("FN Five-Seven", "fiveseven", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[1] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Knife
				it = CreateItem("Combat Knife", "knife", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[2] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
								;Level 5 Key Card
				it = CreateItem("Level 5 Key Card", "key5", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[3] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;NAV
				it = CreateItem("S-NAV 310 Navigator", "nav", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				it\state = 1000
				Inventory[4] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
				
				g_I\Weapon_InSlot[GunSlot1] = "p90"
				g_I\Weapon_InSlot[GunSlot2] = "fiveseven"
				g_I\Weapon_InSlot[GunSlot3] = "knife"
				g_I\Weapon_CurrSlot% = GunSlot1+1
				g_I\HoldingGun = GUN_P90
				For g = Each Guns
					g\PickedUpRedDot = True
					g\PickedUpSuppressor = True
					Select g\ID
						Case GUN_P90
							g\CurrReloadAmmo = 150
							g\HasRedDot = True
							g\HasToggledRedDot = True
							AddRedDot(g)
						Case GUN_FIVESEVEN
							g\CurrReloadAmmo = 60
					End Select
				Next
			Case 1
							;MP5
				it = CreateItem("H&K MP5K", "mp5k", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[0] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;M9
				it = CreateItem("M9 Beretta", "beretta", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[1] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Knife
				it = CreateItem("Combat Knife", "knife", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[2] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Level 5 Key Card
				it = CreateItem("Level 5 Key Card", "key5", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[3] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;NAV
				it = CreateItem("S-NAV 310 Navigator", "nav", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				it\state = 1000
				Inventory[4] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
				
				g_I\Weapon_InSlot[GunSlot1] = "mp5k"
				g_I\Weapon_InSlot[GunSlot2] = "beretta"
				g_I\Weapon_InSlot[GunSlot3] = "knife"
				g_I\Weapon_CurrSlot% = GunSlot1+1
				g_I\HoldingGun = GUN_MP5K
				For g = Each Guns
					g\PickedUpVerticalGrip = True
					g\PickedUpFoldingStock = True
					Select g\ID
						Case GUN_MP5K
							g\CurrReloadAmmo = 90
							g\HasVerticalGrip = True
							g\HasFoldingStock = True
							g\HasToggledFoldingStock = True
							g\HasToggledVerticalGrip = True
							AddVerticalGrip(g)
							AddFoldingStock(g)
						Case GUN_BERETTA
							g\CurrReloadAmmo = 45
					End Select
				Next
			Case 2
							;HK416
				it = CreateItem("H&K 416", "hk416", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[0] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;USP
				it = CreateItem("H&K USP", "usp", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[1] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Knife
				it = CreateItem("Combat Knife", "knife", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[2] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Level 5 Key Card
				it = CreateItem("Level 5 Key Card", "key5", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[3] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;NAV
				it = CreateItem("S-NAV 310 Navigator", "nav", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				it\state = 1000
				Inventory[4] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
				
				g_I\Weapon_InSlot[GunSlot1] = "hk416"
				g_I\Weapon_InSlot[GunSlot2] = "usp"
				g_I\Weapon_InSlot[GunSlot3] = "knife"
				g_I\Weapon_CurrSlot% = GunSlot1+1
				g_I\HoldingGun = GUN_HK416
				For g = Each Guns
					g\PickedUpSuppressor = True
					Select g\ID
						Case GUN_HK416
							g\CurrReloadAmmo = 90
						Case GUN_USP
							g\CurrReloadAmmo = 36
					End Select
				Next
			Case 3
							;SPAS
				it = CreateItem("Franchi SPAS-12", "spas12", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[0] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;P30L
				it = CreateItem("H&K P30L", "p30l", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[1] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Knife
				it = CreateItem("Combat Knife", "knife", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[2] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Level 5 Key Card
				it = CreateItem("Level 5 Key Card", "key5", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[3] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;NAV
				it = CreateItem("S-NAV 310 Navigator", "nav", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				it\state = 1000
				Inventory[4] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
							;Grenade
				it = CreateItem("M61 Grenade", "grenade", 1, 1, 1)
				it\Picked = True
				it\Dropped = -1
				it\itemtemplate\found=True
				Inventory[5] = it
				HideEntity(it\collider)
				EntityType (it\collider, HIT_ITEM)
				EntityParent(it\collider, 0)
				ItemAmount = ItemAmount + 1
				
				g_I\Weapon_InSlot[GunSlot1] = "spas12"
				g_I\Weapon_InSlot[GunSlot2] = "p30l"
				g_I\Weapon_InSlot[GunSlot3] = "knife"
				g_I\Weapon_CurrSlot% = GunSlot1+1
				g_I\HoldingGun = 16
				For g = Each Guns
					Select g\ID
						Case GUN_SPAS12
							g\CurrReloadAmmo = 30
						Case GUN_P30L
							g\CurrReloadAmmo = 51
					End Select
				Next
		End Select
		
		CanPlayerUseGuns% = False
		psp\IsShowingHUD = False
		UnableToMove = 2
		psp\ShowPlayerModel = False
		For i = 0 To 1
			e\room\NPC[i] = CreateNPC(NPCtypeNTF,EntityX(e\room\Objects[3],True),EntityY(e\room\Objects[3],True),EntityZ(e\room\Objects[3],True))
			RotateEntity e\room\NPC[i]\Collider,0,e\room\angle,0
			MoveEntity e\room\NPC[i]\Collider,-0.5+(0.4*Sgn(-0.5+i)),1.0,1.6
			e\room\NPC[i]\State = 1
			EntityParent e\room\NPC[i]\obj,e\room\Objects[0]
		Next
		
		e\room\NPC[1]\PrevState = MTF_UNIT_MEDIC
		e\room\NPC[1]\texture = "GFX\npcs\Humans\MTF\NTF\NineTailedFox_medic.png"
		Local tex = LoadTexture_Strict(e\room\NPC[1]\texture, 1, 2)
		TextureBlend(tex,5)
		EntityTexture(e\room\NPC[1]\obj, tex)
		DeleteSingleTextureEntryFromCache tex
		
		n.NPCs = CreateNPC(NPCtypeNTF,EntityX(e\room\Objects[9],True),EntityY(e\room\Objects[9],True)+0.5,EntityZ(e\room\Objects[9],True))
		n\State = 1
		n\State2 = 1
		PointEntity2(n\Collider, e\room\Objects[11],0,False)
		TeleportEntity n\Collider,EntityX(n\Collider),EntityY(n\Collider),EntityZ(n\Collider),n\CollRadius
		e\room\NPC[2] = n
		
		n.NPCs = CreateNPC(NPCtypeNTF,EntityX(e\room\Objects[10],True),EntityY(e\room\Objects[10],True)+0.5,EntityZ(e\room\Objects[10],True))
		n\State = 1
		n\State2 = 1
		PointEntity2(n\Collider, e\room\Objects[11],0,False)
		RotateEntity n\Collider,0,EntityYaw(e\room\NPC[2]\Collider),0
		TeleportEntity n\Collider,EntityX(n\Collider),EntityY(n\Collider),EntityZ(n\Collider),n\CollRadius
		
		n.NPCs = CreateNPC(NPCtypeGuard,EntityX(e\room\Objects[12],True),EntityY(e\room\Objects[12],True)+0.5,EntityZ(e\room\Objects[12],True))
		n\State = 9
		RotateEntity n\Collider,0,90,0
		TeleportEntity n\Collider,EntityX(n\Collider),EntityY(n\Collider),EntityZ(n\Collider),n\CollRadius
		
		For i = 2 To 4
			e\room\NPC[i] = CreateNPC(NPCtypeApache, e\room\x, 100.0, e\room\z)
			e\room\NPC[i]\State = 0
		Next
		
		PositionEntity Collider,0,0,0
		ResetEntity Collider
		EntityParent Camera,e\room\Objects[0]
		PositionEntity Collider,0.0,0.95,-1.05
		RotateEntity Camera,0,0,0
		MouseXSpeed()
		PositionEntity e\room\NPC[0]\obj,-0.5,0.56,0
		RotateEntity e\room\NPC[0]\obj,0,180,0
		PositionEntity e\room\NPC[1]\obj,-0.9,0.6,-1.05
		RotateEntity e\room\NPC[1]\obj,0,0,0
		
	EndIf
	
	If e\EventState[0] <> 0 And e\EventState[7] > 0 Then
		e\EventStr = Float(e\EventStr) + fps\Factor[0]
		
		For i = 2 To 4
			If e\room\NPC[i]<>Null Then 
				If e\room\NPC[i]\State < 2 Then 
					PositionEntity(e\room\NPC[i]\Collider, EntityX(e\room\Objects[13],True)+Cos(Float(e\EventStr)/10+(120*i))*6000.0*RoomScale,15000*RoomScale,EntityZ(e\room\Objects[13],True)+Sin(Float(e\EventStr)/10+(120*i))*6000.0*RoomScale)
					RotateEntity e\room\NPC[i]\Collider,7.0,(Float(e\EventStr)/10+(120*i)),20.0
				EndIf
			EndIf
		Next
		Curr106\Idle = True
		Curr173\Idle = SCP173_DISABLED
		PositionEntity Curr173\Collider,0,-20,0
		
		CameraFogRange Camera, 5,30
		CameraFogColor (Camera,200,200,200)
		CameraClsColor (Camera,200,200,200)
		CameraRange(Camera, 0.005, 100)
		HideEntity Overlay[0]
		
		UpdateSky(Sky)
		TurnEntity e\room\Objects[4],0,20.0*fps\Factor[0],0
		TurnEntity e\room\Objects[5],20.0*fps\Factor[0],0,0
		e\SoundCHN = LoopSound2(e\Sound,e\SoundCHN,Camera,e\room\Objects[4],10,0.75)
		ShowEntity e\room\Objects[6]
		If e\EventState[0] = 1
			CameraShake = 0.25
			ResetEntity Collider
			e\EventState[2] = Max(e\EventState[2]-0.005*fps\Factor[0],0)
			EntityAlpha e\room\Objects[6],e\EventState[2]
			If e\EventState[1] < 70*6
				e\EventState[1] = e\EventState[1] + fps\Factor[0]
			ElseIf e\EventState[1] >= 70*6 And e\EventState[1] < 70*10
				CreateSplashText(GetLocalString("Singleplayer","ntf_status"),20,opt\GraphicHeight-200,250,1,Font_Digital_Large)
				If e\Sound2<>0 Then FreeSound_Strict(e\Sound2)
				e\Sound2 = LoadSound_Strict("SFX\Room\Intro\Line1.ogg")
				e\SoundCHN2 = PlaySound_Strict(e\Sound2)
				e\EventState[1] = 70*10
			ElseIf e\EventState[1] >= 70*10 And e\EventState[1] <= 70*15
				e\EventState[1] = e\EventState[1] + fps\Factor[0]
			ElseIf e\EventState[1] >= 70*15 And e\EventState[1] < 70*20
				If e\Sound2<>0 Then FreeSound_Strict(e\Sound2)
				e\Sound2 = LoadSound_Strict("SFX\Room\Intro\Line2.ogg")
				e\SoundCHN2 = PlaySound_Strict(e\Sound2)
				e\EventState[1] = 70*20
			ElseIf e\EventState[1] >= 70*20 And e\EventState[1] < 70*25
				e\EventState[1] = e\EventState[1] + fps\Factor[0]
			EndIf
			If EntityDistanceSquared(e\room\Objects[0],e\room\Objects[2])>PowTwo(0.5)
				MoveEntity e\room\Objects[0],0,0,5.0*fps\Factor[0]
			Else
				e\EventState[0] = 2
				If e\Sound2<>0 Then FreeSound_Strict(e\Sound2)
				e\Sound2 = LoadSound_Strict("SFX\Room\Intro\Line3.ogg")
				e\SoundCHN2 = PlaySound_Strict(e\Sound2)
			EndIf
		ElseIf e\EventState[0] = 2
			CameraShake = 0.25
			ResetEntity Collider
			If EntityDistanceSquared(e\room\Objects[0],e\room\Objects[3])>PowTwo(1.0)
				Local oldpitch# = EntityPitch(e\room\Objects[0])
				PointEntity e\room\Objects[0],e\room\Objects[3]
				MoveEntity e\room\Objects[0],0,0,5.0*fps\Factor[0]
				RotateEntity e\room\Objects[0],oldpitch#,EntityYaw(e\room\Objects[0]),EntityRoll(e\room\Objects[0])
				RotateEntity e\room\Objects[0],CurveAngle(-15.0,EntityPitch(e\room\Objects[0]),100),EntityYaw(e\room\Objects[0]),0
			Else
				e\EventState[0] = 3
				e\EventState[1] = 5.0
				If e\Sound2<>0 Then FreeSound_Strict(e\Sound2)
				e\Sound2 = LoadSound_Strict("SFX\Room\Intro\Line4.ogg")
				e\SoundCHN2 = PlaySound_Strict(e\Sound2)
			EndIf
		ElseIf e\EventState[0] = 3
			CameraShake = 0.25
			ResetEntity Collider
			If EntityDistanceSquared(e\room\Objects[0],e\room\Objects[3])>PowTwo(0.05)
				e\EventState[2] = Min(e\EventState[2]+0.01*fps\Factor[0],1)
				EntityAlpha e\room\Objects[6],e\EventState[2]
				oldpitch# = EntityPitch(e\room\Objects[0])
				PointEntity e\room\Objects[0],e\room\Objects[3]
				e\EventState[1] = CurveValue(0.25,e\EventState[1],25.0)
				MoveEntity e\room\Objects[0],0,0,e\EventState[1]*fps\Factor[0]
				RotateEntity e\room\Objects[0],oldpitch#,EntityYaw(e\room\Objects[0]),EntityRoll(e\room\Objects[0])
				RotateEntity e\room\Objects[0],CurveAngle(-2.5,EntityPitch(e\room\Objects[0]),100),EntityYaw(e\room\Objects[0]),0
			Else
				e\EventState[0] = 4
				For i = 0 To 1
					EntityParent e\room\NPC[i]\obj,0
					e\room\NPC[i]\State2 = 1
				Next
				EntityParent Camera,0
				PositionEntity Collider,EntityX(e\room\Objects[3],True)-0.5,EntityY(e\room\Objects[3],True)+0.5,EntityZ(e\room\Objects[3],True)+2.2
				ResetEntity Collider
				RotateEntity Camera,0,0,0
				MouseXSpeed() : MouseYSpeed()
				If e\Sound2<>0 Then FreeSound_Strict(e\Sound2)
				e\Sound2 = LoadSound_Strict("SFX\Room\Intro\Line5.ogg")
				e\SoundCHN2 = PlaySound_Strict(e\Sound2)
			EndIf
		ElseIf e\EventState[0] = 4
			If (Not ChannelPlaying(e\SoundCHN2))
				If e\EventState[2]>0.0
					e\EventState[2] = Max(e\EventState[2]-0.005*fps\Factor[0],0)
					EntityAlpha e\room\Objects[6],e\EventState[2]
				Else
					EntityAlpha e\room\Objects[6],0.0
					e\EventState[0] = 5
				EndIf
			EndIf
		ElseIf e\EventState[0] = 5
			UnableToMove = False
			CanPlayerUseGuns% = True
			If HUDenabled Then
				psp\IsShowingHUD = True
			EndIf
			If opt\PlayerModelEnabled Then
				psp\ShowPlayerModel = True
			EndIf
			If TaskExists(TASK_CLASSIC_ARRIVE_AT_SITE) Then
				EndTask(TASK_CLASSIC_ARRIVE_AT_SITE)
			EndIf
			If (Not TaskExists(TASK_CLASSIC_ENTER_SITE)) Then
				BeginTask(TASK_CLASSIC_ENTER_SITE)
			EndIf
			If e\Sound2<>0 Then FreeSound_Strict(e\Sound2)
			e\Sound2 = LoadSound_Strict("SFX\Room\Intro\Line6.ogg")
			e\SoundCHN2 = PlaySound_Strict(e\Sound2)
			e\EventState[0] = 6
		ElseIf e\EventState[0] = 6
			MoveEntity e\room\Objects[0],0,5.0*fps\Factor[0],5.0*fps\Factor[0]
			CurrSpeed = Min(CurrSpeed - (CurrSpeed * (0.001/EntityDistance(e\room\NPC[0]\Collider, Collider)) * fps\Factor[0]), CurrSpeed)
			e\room\NPC[0]\State = 0
			e\room\NPC[1]\State = 0
			If EntityDistanceSquared(e\room\NPC[0]\Collider,e\room\Objects[7]) < PowTwo(2.5) And EntityDistanceSquared(e\room\NPC[1]\Collider,e\room\Objects[7]) < PowTwo(2.5) Then 
				e\room\RoomDoors[0]\locked = False
				e\EventState[1] = UpdateElevators(e\EventState[1],e\room\RoomDoors[0],e\room\RoomDoors[1],e\room\Objects[7],e\room\Objects[8],e)
			Else
				e\room\RoomDoors[0]\locked = True
			EndIf
			If EntityDistanceSquared(Collider,e\room\Objects[8])<PowTwo(1.5) Then
				
				e\EventState[3] = e\EventState[3] + (0.01*fps\Factor[0])
				;EntityAlpha e\room\Objects[14],Min(e\EventState[3],1.0)
				
				If e\EventState[3] > 0 Then
					
					For i = 0 To 1
						If e\room\NPC[i] <> Null Then
							RemoveNPC(e\room\NPC[i])
						EndIf
					Next
					
					SaveGame(SavePath + CurrSave\Name + "\")
					
					gc\CurrZone = EZ
					
					ResetControllerSelections()
					DropSpeed = 0
					NullGame(True,False)
					LoadEntities()
					LoadAllSounds()
					Local zonecache% = gc\CurrZone
					If FileType(SavePath + CurrSave\Name + "\" + gc\CurrZone + ".sav") = 1 Then
						LoadGame(SavePath + CurrSave\Name + "\", gc\CurrZone)
						InitLoadGame()
					Else
						InitNewGame()
						LoadDataForZones(SavePath + CurrSave\Name + "\")
					EndIf
					gc\CurrZone = zonecache
					MainMenuOpen = False
					FlushKeys()
					FlushMouse()
					FlushJoy()
					ResetInput()
					
					SaveGame(SavePath + CurrSave\Name + "\")
					Return
				EndIf
			EndIf
		EndIf
	EndIf
	
End Function

;~IDEal Editor Parameters:
;~C#Blitz3D